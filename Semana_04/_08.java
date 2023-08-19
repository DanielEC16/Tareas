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
public class _08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Alumnos : ");
        int Alum = S.nextInt();
        double P;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
        for (int i = 1; i <= Alum; i++) {
            System.out.print("Ingrese el peso del Alumno " + i + " : ");
            P = S.nextDouble();
            if (P < 40) {
                cont1++;
            }
            if (P >= 40 && P < 50) {
                cont2++;
            }
            if (P >= 50 && P < 60) {
                cont3++;
            }
            if (P >= 60) {
                cont4++;
            }
        }
        System.out.println("");
        System.out.println("Alumnos de menos de 40 kg : " + cont1);
        System.out.println("Alumnos entre 40 y 50 kg : " + cont2);
        System.out.println("Alumnos de más de 50 y menos de 60 kg : " + cont3);
        System.out.println("Alumnos de más o igual a 60 kg : " + cont4);
    }

}
