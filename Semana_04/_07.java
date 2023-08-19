/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana_04;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIEL
 */
public class _07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Ingrses la cantidad de Alumnos :");
        int Alumn = S.nextInt();
        double EP,EF,TF,Prom;
        for (int i = 1; i <= Alumn; i++) {
            System.out.println("Ingrese la nota del Examen Parcial");
            EP = S.nextDouble();
            System.out.println("Ingrese la nota del Examen Final");
            EF = S.nextDouble();
            System.out.println("Ingrese la nota del Trabajo Final");
            TF = S.nextDouble();
            Prom = (EF*0.55)+(EP*0.30)+(TF*0.15);
            System.out.println("El promedio del Alumno "+i+" es igual a : "+Prom);
        }

    }

}
