package Clases;

import java.util.Scanner;

public class Ejercicio8 {

    /*8.	Escriba un programa donde se ingrese el tiempo necesario 
    para un cierto proceso en horas, minutos y segundos. Se calcule el costo total 
    del proceso sabiendo que el costo por segundo es  S/. 0.25*/
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio_segundo = 0.25;
        int total_segundos = 0;
        int horas, minutos, segundos;
        double costo_total = 0;

        
        System.out.println("Ingrese las horas: ");
        horas = entrada.nextInt();
        System.out.println("Ingrese los minutos: ");
        minutos = entrada.nextInt();
        System.out.println("Ingrese los segundos: ");
        segundos = entrada.nextInt();

        total_segundos = ( horas * 3600 +  minutos * 60 + segundos);
        costo_total =  total_segundos * precio_segundo;

        System.out.println("Los segundos son " + total_segundos + " y el costo total es " + costo_total);

    }

}
