package org.example;

public class Rutina {
    //ATRIBUTOS
    String nameRut;
    int series;
    int repetitions;

    //CONSTRUCTOR

    public Rutina(String nameRutina, int repetitions, int series) {
        this.nameRut = nameRutina;
        this.repetitions = repetitions;
        this.series = series;
    }

    //METODOS
    public void mostrarRutina(){
        System.out.println("=======INFORMATION OF EXECICE=======");
        System.out.println("Name of Exercice  : "+nameRut);
        System.out.println("Num. Repettitions :"+repetitions);
        System.out.println("Num. Series       :"+series);
    }
}
