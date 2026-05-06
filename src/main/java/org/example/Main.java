package org.example;

import javax.swing.text.rtf.RTFEditorKit;
import javax.swing.JFrame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creamos la ventana fisica
        JFrame frame = new JFrame("Calculadora de Descanzos");
        //inyectamos el panel principal
        frame.setContentPane(new PantallaDescanso().panelPrincipal);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}