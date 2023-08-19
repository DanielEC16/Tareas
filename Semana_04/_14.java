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
public class _14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos : ");
        int N = S.nextInt();
        int cont, num1 = 1, num2 = 0;
        String temp = "";
        for (int i = 1; i <= N; i++) {

            cont = num1 + num2;
            temp += " " + String.valueOf(cont);
            num2 = num1;
            num1 = cont;
        }
        System.out.println("" + temp);
    }

}
