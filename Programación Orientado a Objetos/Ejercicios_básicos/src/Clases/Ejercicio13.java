/*
 13.	Calcular el área y perímetro de un cuadrado, a partir de su lado.
 */
package Clases;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        int area = 0;
        int lado = 0;
        System.out.println("----cuadrado---");

        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del lado: ");
        lado = numero.nextInt();

        int perimetro = lado * 4;
        System.out.println("El  perimetro del cuadrado es: " + perimetro);

        area = lado * lado;
        System.out.println("el area del cuadrado es: " + area);
    }

}
