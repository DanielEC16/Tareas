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
public class _06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        int cuadrado = 0;

        for (int i = 1, impar = 1; i <= n; i++, impar += 2) {
            cuadrado += impar;
        }

        System.out.println("El cuadrado de " + n + " es: " + cuadrado);
    }
}
