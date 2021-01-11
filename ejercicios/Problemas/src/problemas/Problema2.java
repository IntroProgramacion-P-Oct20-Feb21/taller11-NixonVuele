/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    //metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int opcion;
        // opciones a escoger por el usuario
        System.out.println("Ingrese el numero:");
        System.out.println("1. Si desea calcular el area de un cuadrado");
        System.out.println("2. Si desea calcular el area de un Triangulo");
        System.out.println("3. Si desea calcular el area de un Rectangulo");
        opcion = teclado.nextInt();
        if (opcion == 1) {
            areaCuadrado();
        } else if (opcion == 2) {
            areaTriangulo();
        } else if (opcion == 3) {
            areaRectangulo();
        } else {
            System.out.println("No es una opcion a elegir");
        }
    }

    public static void areaCuadrado() {
        //declaracion de variables
        Scanner teclado = new Scanner(System.in);
        double lado;
        double area;
        //Se pide los datos y se realisa el proceso
        System.out.println("Cual es el lado del cuadrado");
        lado = teclado.nextDouble();
        area = lado + lado;
        //salida
        System.out.printf("%s %.2f\n", "El area del cuadrado es:", area);
    }

    public static void areaTriangulo() {
        //declaracion de variables
        Scanner teclado = new Scanner(System.in);
        double altura;
        double area;
        double base;
        //Se pide los datos y se realisa el proceso
        System.out.println("Cual es la base del triangulo");
        base = teclado.nextDouble();
        System.out.println("Cual es la altura del triangulo");
        altura = teclado.nextDouble();
        area = (base * altura) / 2;
        //salida
        System.out.printf("%s %.2f\n", "El area del triangulo es:", area);
    }

    public static void areaRectangulo() {
        //declaracion de variables
        Scanner teclado = new Scanner(System.in);
        double altura;
        double area;
        double base;
        //Se pide los datos y se realisa el proceso
        System.out.println("Cual es la base del Rectangulo");
        base = teclado.nextDouble();
        System.out.println("Cual es la altura del Rectangulo");
        altura = teclado.nextDouble();
        area = base * altura;
        //salida
        System.out.printf("%s %.2f\n", "El area del Rectangulo es:", area);
    }
}
