import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.util.List;

public class clsGrafEst {
    public static JFreeChart genGraf(List<clsDataset> datos) {
        if(datos.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "cargue un csv primero",
                    "ADVERTENCIA",
                    JOptionPane.WARNING_MESSAGE);
            return null;
        }
        double[] darRL = calRegLin(datos);
        double m = darRL[0];
        double b = darRL[1];

        XYSeries ptos = new XYSeries("Datos");
        double minX = Double.MAX_VALUE;
        double maxX = Double.MIN_VALUE;

        for(clsDataset d : datos) {
            ptos.add(d.getX(), d.getY());
            if(d.getX() < minX) {minX = d.getX();}
            if(d.getX() > maxX) {maxX = d.getX();}
        }
        XYSeriesCollection dsTemp = new XYSeriesCollection();
        dsTemp.addSeries(ptos);

        //Generar el grafico estadistico (ge) tipo Scatter plot (graf. Dispersion)

        JFreeChart ge = ChartFactory.createScatterPlot(
                "Grafico de dispersion",
                "X",
                "Y",
                dsTemp
        );

        XYPlot plot = ge.getXYPlot();

        //Recta
        XYSeries linea = new XYSeries("Recta");
        linea.add(minX, m*minX + b);
        linea.add(maxX, m*maxX + b);

        XYSeriesCollection dsTemp2 = new XYSeriesCollection();
        dsTemp2.addSeries(linea);

        plot.setDataset(1, dsTemp2);
        plot.setRenderer(1, new XYLineAndShapeRenderer(true, false));
        return ge;

    }
    private static double [] calRegLin(List<clsDataset> datos) {
        int n = datos.size();
        double x, y, sumX = 0, sumY = 0, promX, promY = 0, num = 0, denom = 0;
        double m, b; //Varialbes para e hallazgo de la regresión lineal(m=pendiente, b= intercepto)

        for (clsDataset dato : datos) {
            x = dato.getX();
            y = dato.getY();
            sumX += x;
            sumY += y;
        }
        promX = sumX / n;
        promY = sumY / n;

        for (clsDataset dato : datos) {
            num += (dato.getX() - promX) * (dato.getY() - promY);
            denom += Math.pow(dato.getX() - promX, 2);
        }
        m = num / denom;
        b = promY - m * promX;
        return new double [] {m, b};

    }
}
