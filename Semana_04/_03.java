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
public class _03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        int N = S.nextInt(); String cad="";
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                cad += i+" ";
            }
        }
        System.out.println("La suma es igual a : " + cad);
    }
}
