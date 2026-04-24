package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
/*
        //declaramos las variables
        String names= "Christian Wilber";
        String lastname="Atamari Hancco";
        int age = 24;
        double hoursOfStudy=4.0 ;


        System.out.println("=============== Hello and welcome to MY DATA ===============");


        System.out.println("Mi NOMBRE ES: " + names + " " + lastname + "\n" +
                "MI Edad: " + age + "\n" +

                "Mis Horas de Estudio: " + hoursOfStudy);
  */
        //codigo para calcular el tiempo de desanso recomendado
        double liftedWeight= 80.0;
        int repetitions= 10;


       if(repetitions<=0){
           System.out.println("NO HICISTE NI UNA REPETICION");
       }
       else if(repetitions>=1 && repetitions<=5) {
           System.out.println("Descanzo 3 minutos");

        }
       else if(repetitions>=6 && repetitions<=12) {
           System.out.println("Descanso 1 a 2 minutos por la hipertrofia");

       }else{
           System.out.println("Tu quieres ganar resistencia muscular, descansa 45 segundos");
       }
        System.out.println("========DATA OF USERS=========");
        System.out.println("My liftedWeight is :"+liftedWeight);
        System.out.println("My repetitions :"+ repetitions);

    }

}

