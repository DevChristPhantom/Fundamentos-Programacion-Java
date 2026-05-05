package org.example;

import javax.swing.text.rtf.RTFEditorKit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Usuarios myUser = new Usuarios("CHRISTIAN",24,84);
        Usuarios myUser1= new Usuarios("Naye",30,70);

        myUser1.mostrarPerfilUser();
        myUser.mostrarPerfilUser();

        Rutina myRutina = new Rutina("Press de Banca",10,4);
        Rutina myRuntina1 = new Rutina("Press Militar",12,4);

        myRutina.mostrarRutina();
        myRuntina1.mostrarRutina();
    }

}