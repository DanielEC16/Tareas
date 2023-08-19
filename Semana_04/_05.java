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
public class _05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Ingrese el primer numero : ");
        int N1 = S.nextInt();
        System.out.println("Ingrese el segundo numero : ");
        int N2 = S.nextInt();
        int SumI = 0, SumP = 0;
        for (int i = 1; i <= N1; i++) {
            if (i % 2 == 0) {
                SumP += i;
            }
        }
        for (int i = 1; i <= N2; i++) {
            if (i % 2 != 0) {
                SumI += i;
            }
        }
        
        System.out.println("Suma de pares del primer numero "+N1+" es igual a : "+SumP);
        System.out.println("Suma de impares del segundo numero "+N2+" es igual a :"+SumI);
    }

}
