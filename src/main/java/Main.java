import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame objFP = new JFrame("Analizador de Regresión Lineal");

        objFP.setContentPane(new frmPrincipal().jpPrincipal);

        objFP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        objFP.setSize(400, 600);

        objFP.setLocationRelativeTo(null);

        objFP.setVisible(true);
    }
}