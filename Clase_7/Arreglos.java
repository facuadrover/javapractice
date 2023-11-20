package Clase_7;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);



        /*int contador = 0;*/

        //System.out.println("Ingrese un número");


       /* while (contador < numeros.length){
            System.out.println("Ingrese un número");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
            contador++;
        }*/


        /*contador = 0;
        while (contador < numeros.length){
            System.out.println(numeros[contador]);
            contador++;
        }*/


        for (int contador = 0; contador < numeros.length; contador++){
            System.out.println("Ingrese un número");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
        }


        for (int contador = 0; contador < numeros.length; contador++){
            System.out.println(numeros[contador]);
        }


    }
}
