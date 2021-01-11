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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int cedula;
        int opcion;
        System.out.println("Ingresar el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar el numero de cédula del cliente: ");
        cedula = entrada.nextInt();
        System.out.println("Ingrese el numero:");
        System.out.println("1. si desea pagar la luz");
        System.out.println("2. si desea pagar el predio del inmueble");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            calcularValorLuz(nombre, cedula);
        } else if (opcion == 2) {
            calcularPredio(nombre, cedula);
        } else {
            System.out.println("No es una opcion a elegir");
        }
    }

    public static void calcularValorLuz(String nombre, int cedula) {
        //declaracion de variables
        Scanner entrada = new Scanner(System.in);
        double valorKilovatios;
        double kilovatiosMes;
        double valorPanilla;
        //se piden los datos necesarios
        System.out.println("Ingresar el valor del kilovatio: ");
        valorKilovatios = entrada.nextDouble();
        System.out.println("Ingresar el número de kilovatios consumidos: ");
        kilovatiosMes = entrada.nextDouble();
        valorPanilla = valorKilovatios * kilovatiosMes;
        //Salida
        System.out.printf("Cliente %s con cédula %d debe cancelar el "
                + "valor de $%.2f\n",
                nombre, cedula, valorPanilla);
    }

    public static void calcularPredio(String nombre, int cedula) {
        //declaracion de variables
        Scanner entrada = new Scanner(System.in);
        double inmueble;
        double predio;
        System.out.println("Cual es el precio del inmueble");
        inmueble = entrada.nextDouble();
        // calculo del predio, salida
        predio = inmueble * 0.2;
        System.out.printf("Cliente %s con cédula %d tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f\n",
                nombre, cedula, inmueble, predio);
    }

}
