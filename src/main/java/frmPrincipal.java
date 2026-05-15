import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class frmPrincipal {
    public JPanel jpPrincipal;
    private JPanel jpCarDataset;
    private JButton btnSelArch;
    private JPanel jpGestFor;
    private JPanel jpGestBot;
    private JButton btnGrafFor;
    private JPanel jpGrafEst;
    private JTextArea txtaDataset;
    private final List<clsDataset> datos = new ArrayList<>();

    public frmPrincipal() {
        agreEve();
        btnGrafFor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFreeChart ge = clsGrafEst.genGraf(datos);
                ChartPanel cp = new ChartPanel(ge);
                cp.setPreferredSize(new Dimension(jpGrafEst.getWidth(), jpGrafEst.getHeight()));
                jpGrafEst.add(cp, BorderLayout.CENTER);
                jpGrafEst.repaint();
            }
        });
    }

    private void agreEve() {
        btnSelArch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carArchCSV();
            }
        });

    }

    private void carArchCSV() {
        JFileChooser elecArch = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("archivo csv", "csv");
        elecArch.setFileFilter(filtro);

        int archSel = elecArch.showOpenDialog(null);
        if (archSel == JFileChooser.APPROVE_OPTION) {
            File archivo = elecArch.getSelectedFile();
            leerCSV(archivo);
        }
    }

    private void leerCSV(File archivo) {
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            datos.clear();
            txtaDataset.setText("");
            while ((linea = lector.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    String[] valores = linea.split(",");
                    try {
                        double x = Double.parseDouble(valores[0]);
                        double y = Double.parseDouble(valores[1]);
                        clsDataset dato = new clsDataset(x, y);
                        datos.add(dato);

                        txtaDataset.append("x" + dato.getX() + " y" + dato.getY() + "\n");
                    } catch (NumberFormatException e) {
                        continue;
                    }
                }
            }

        }  catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}


