/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana_04;

import java.util.Scanner;

/**
 *
 * @author DANIEL
 */
public class _15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo (menor que 10): ");
        int n = scanner.nextInt();

        if (n <= 0 || n >= 10) {
            System.out.println("El número debe ser positivo y menor que 10.");
        } else {
            System.out.print("Ingrese el carácter para formar el triángulo: ");
            String caracter = scanner.next();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(caracter);
                }
                System.out.println();
            }
        }
    }
}
