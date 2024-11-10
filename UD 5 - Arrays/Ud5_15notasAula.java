/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud5_15notasaula;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ud5_15notasAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Creamos una matriz para almacenar las notas de los 5 alumnos en 3 trimestres
        int [][] classGroup = new int [5][3];
         // Leer las notas de los alumnos
           for (int i = 0; i < 5; i++) {
            System.out.println("Notas del alumno " + (i + 1) + ":");
            //Introducimos un while dentro de la nota de cada trimestre para que solo se introduzcan notas entre 0 y 10
            //ya que es el sistema mas comun de calificaciones
            System.out.print("Nota primer trimestre: ");
            classGroup[i][0] = sc.nextInt(); 
             while (classGroup[i][0] < 0 || classGroup[i][0] > 10) { 
                System.out.println("Nota inválida. Debe estar entre 0 y 10. Intentalo de nuevo.");
                System.out.print("Nota primer trimestre: ");
                classGroup[i][0] = sc.nextInt();
            }
            System.out.print("Nota segundo trimestre: ");
            classGroup[i][1] = sc.nextInt();
            while (classGroup[i][1] < 0 || classGroup[i][1] > 10) {
                System.out.println("Nota inválida. Debe estar entre 0 y 10. Intentalo de nuevo.");
                System.out.print("Nota segundo trimestre: ");
                classGroup[i][1] = sc.nextInt();
            }
            System.out.print("Nota tercer trimestre: ");
            classGroup[i][2] = sc.nextInt();
            while (classGroup[i][2] < 0 || classGroup[i][2] > 10) {
                System.out.println("Nota inválida. Debe estar entre 0 y 10. Intentalo de nuevo.");
                System.out.print("Nota tercer trimestre: ");
                classGroup[i][2] = sc.nextInt();
            }
        }
        
        // Mostramos la media de cada trimestre del grupo
        showAverageTerm(classGroup);
        
        // Preguntamos al usuario la posición del alumno para mostrar su media
        System.out.print("Introduce la posición del alumno (1-5) para ver su media: ");
        int posicion = sc.nextInt();
        
        // Mostramos la media del alumno en la posición indicada
        averageFromStudent(classGroup, posicion);
    
    }

   public static void showAverageTerm(int[][] grupo) { 
       //Funcion para calcular la media del trimestre
        for (int term = 0; term < 3; term++) {
            int totalGrades = 0; //El bucle externo hará que recorra el array en cada trimestre
            for (int student = 0; student < 5; student++) { //El bucle interno hará que recorra el array por cada alumno
                totalGrades += grupo[student][term];
            }
            double averageTerm = totalGrades / 5.0;
            System.out.println("La media del grupo en el trimestre " + (term + 1) + " es: " + averageTerm);
        }
    } 
   public static void averageFromStudent(int[][] classGroup, int studentPosition) { 
       //Funcion para calcular la media de un alumno en concreto
        if (studentPosition >= 1 && studentPosition <= 5) { //Nos aseguramos que esté dentro del rango del array
            int totalGradesOfStudent = 0; //Variable en la que almacenaremos el total de sus notas para hacer la media
            for (int term = 0; term < 3; term++) {
                totalGradesOfStudent += classGroup[studentPosition - 1][term];
            } //Tenemos que restar 1 a studentPosition para que de la posicion exacta del array, ya que al ser 5 va de 0 a 4
            double averageStudent = totalGradesOfStudent / 3.0;
            System.out.println("La media del alumno " + studentPosition + " es: " + averageStudent);
        } else { 
            System.out.println("Posición del alumno inválida. Debe ser un número entre 1 y 5.");
        }
    }
}
