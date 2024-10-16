package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RecursosFill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase;

        do {
            System.out.println("Introdueix un número o escriu 'EXIT': ");
            frase=sc.nextLine();
            if (!frase.equalsIgnoreCase("EXIT")) {
                try {
                    int num=Integer.parseInt(frase);
                    if (num % 2 == 0) {
                        System.out.println("El número " + num + " és parell.");
                    } else {
                        System.out.println("El número " + num + " és senar.");
                    }
                }catch (Exception e) {
                    System.out.println("Has d'introduïr un número!.");
                }
            }
        }while (!frase.equalsIgnoreCase("EXIT"));
        System.out.println("Adéu!");
        sc.close();
    }
}