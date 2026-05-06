package org.example;

public class Ejercicio {
   //atributos
    protected String name;
    protected int caloriasQuemadas;

    //constructor

    public Ejercicio(String typeName, int typeCaloriasQuemadas) {
        this.name = typeName;
        this.caloriasQuemadas = typeCaloriasQuemadas;
    }

    //aplicamos override o polimorfismo para que la clase hija pueda usar el atributo de la clase padre
    //metodos

    public void mostrarResumen() {
        System.out.println("name of excercise :" + name);
        System.out.println("Calories          :" + caloriasQuemadas + "Kcal");
        //aplicamos super para llamrlo
    }
}
