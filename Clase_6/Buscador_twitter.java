package Clase_6;

import java.util.Scanner;

public class Buscador_twitter {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la persona que quiere buscar:");
        String persona = teclado.nextLine();
        System.out.println("https://twitter.com/search?q=" + persona);
    }

}
