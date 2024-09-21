package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    enum Estado {
        C1, C2
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estado estadoActual = Estado.C1;
        String entrada;
        System.out.println("Introduce una cadena de 'a' y 'b'(TERMINA CON SALIR)");

        while (true) {
            System.out.print("Entrada: ");
            entrada = sc.nextLine();

            if (entrada.equals("exit")) {
                break;
            }
        }
    }
}
