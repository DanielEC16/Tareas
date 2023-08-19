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
public class _10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Escriba la cantidad de valores : ");
        int C = S.nextInt(), sum = 0;

        for (int i = 1, num = 1, sign = -1; i <= C; i++, num *= 2, sign *= -1) {
            sum += num + sign;
        }
        System.out.println("La suma total es igual a : " + sum);
    }
}
