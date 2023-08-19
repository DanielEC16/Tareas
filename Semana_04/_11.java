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
public class _11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Ingrese un número entero N: ");
        int N = S.nextInt();

        int primerTermino = 1;
        int segundoTermino = 2;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            System.out.print(primerTermino + " + " + segundoTermino + " / ");
            primerTermino += 2;
            segundoTermino += 2;
            if (segundoTermino == 4) {
                primerTermino = 1;
            }
            sum += primerTermino+segundoTermino; 
        }
        System.out.println("\nSuma de los valores : "+sum);
    }

}
