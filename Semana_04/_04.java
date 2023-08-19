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
public class _04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Ingrese un numero natural : ");
        int Num = S.nextInt();
        for (int i = 0; i <= 12; i++) {
            System.out.println(Num+" x "+i+" = "+(i*Num));
        }
    }
    
}
