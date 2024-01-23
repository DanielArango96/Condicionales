package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreFruta;
        Boolean estaEnTemporada=true;
        Integer costoBulto;




        Scanner lea=new Scanner(System.in);


        System.out.println("Ingrese que fruta desea:");
        nombreFruta= lea.nextLine();
        System.out.println("Esta en temporada:");
        estaEnTemporada=lea.nextBoolean();


        if (estaEnTemporada){
            System.out.println("La fruta es colombiana:");
            Boolean esColombiana=lea.nextBoolean();
            if (esColombiana){
                costoBulto=100000;
                System.out.println("El costo es: "+costoBulto);
            }else {
                costoBulto=200000;
                System.out.println("El costo es: "+costoBulto);

            }
        }else {
            costoBulto=350000;
            System.out.println("el costo es: "+costoBulto);

        }
    }
}