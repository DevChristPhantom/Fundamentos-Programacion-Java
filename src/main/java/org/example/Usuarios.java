package org.example;

import java.sql.SQLOutput;

public class Usuarios {
    //ATRIBUTOS DE LOS USUARIOS
    String name;
    int age;
    int pesoActual;

    //AGREGAMOS SUS CONTRUCTOR

    public Usuarios(String nameTyping, int ageTyping, int pesoActualTyping) {
        this.name = nameTyping;
        this.age = ageTyping;
        this.pesoActual = pesoActualTyping;
    }

    //METODOS
    public void mostrarPerfilUser(){
        System.out.println("======== USER PERFIL =======");
        System.out.println("Name :"+ this.name);
        System.out.println("age  :"+ this.age +"años");
        System.out.println("Peso :"+ this.pesoActual+"kg");
    }
}
