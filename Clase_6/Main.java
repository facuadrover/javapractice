package Clase_6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Cargar 3 numeros y mostrar el menor y el mayor

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese el numero 2: ");
        int numero2 = teclado.nextInt();
        System.out.println("Ingrese el numero 3: ");
        int numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero más grande es: " + numero1);
        }
        if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero más grande es: " + numero2);
        }
        if (numero3 > numero2 && numero3 > numero1) {
            System.out.println("El numero más grande es: " + numero3);
        }
    }
}
