package org.example;

public class EjerciciosCardio extends Ejercicio {
    //atributo propio
    private double distanciakm;
    //constructor super ya que esta heredando
    public EjerciciosCardio(String typeName, int typeCaloriasQuemadas, double typeDistancia) {
        super(typeName, typeCaloriasQuemadas);
        this.distanciakm = typeDistancia;//inicializamos
    }
    @Override
    public void mostrarResumen(){

        //aplicamos super para llamrlo
        super.mostrarResumen();
        System.out.println("Distancia         :" +this.distanciakm + "Km");
    }

}
