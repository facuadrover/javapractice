package Clase_6;

import java.util.Scanner;

public class Ejercicio_map {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el País:");
        String pais = teclado.nextLine();
        System.out.println("https://www.google.com/maps/search/" + pais);
    }

}