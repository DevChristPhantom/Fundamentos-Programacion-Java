package org.example;

import javax.swing.text.rtf.RTFEditorKit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EjerciciosCardio maqTrotar = new EjerciciosCardio("CINTA DE CORRER",500,100);

        //LLAMAMOS AL METODO PADRE
        maqTrotar.mostrarResumen();
    }

}