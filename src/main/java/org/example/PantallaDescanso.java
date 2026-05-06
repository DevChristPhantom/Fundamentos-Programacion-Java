package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaDescanso {
    private JTextField txtRepeticiones;
    private JButton btnCalcular;
    private JLabel lblResultado;
    public JPanel panelPrincipal;

    //constructor
    public PantallaDescanso(){
        //asignamos el escuchador
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //CONTROL DE ERROES
                try {
                    String textoIngresado = txtRepeticiones.getText();
                    int reps = Integer.parseInt(textoIngresado);
                    //logica
                    String mensaje;
                    if (reps <= 0) {
                        mensaje = "Error: Repeticiones no validas";
                    } else if (reps >= 1 && reps <= 12) {
                        mensaje = "Fuerza: Desanza 3 a 5 minutos.";
                    } else if (reps >= 12 && reps <= 20) {
                        mensaje = "Hipertrofia: Descanza 1 a 2 minutos";
                    } else {
                        mensaje = "Calentando";
                    }

                //inyectar resutaldo
                lblResultado.setText(mensaje);
                }catch (NumberFormatException ex){
                    //si el user escribe letras..el convertidor fallara y caera aqui
                    lblResultado.setText("Error: POR FAVOR INGRESAR UN NUMERO ENTERO VALIDO");
                }


            }

        });
    }
}
