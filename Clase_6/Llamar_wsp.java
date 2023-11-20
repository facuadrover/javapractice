package Clase_6;

import java.util.Scanner;

public class Llamar_wsp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de la persona que quiere llamar:");
        String telefono = teclado.nextLine();
        System.out.println("https://api.whatsapp.com/send?phone=" + telefono);
    }
}
