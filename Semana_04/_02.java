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
public class _02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Ingrese un numero natural : ");
        int N = S.nextInt(), sum = 0;
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }
        System.out.println("La suma es de : " + sum);
    }

}
