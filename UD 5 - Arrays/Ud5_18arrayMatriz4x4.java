/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud5_18arraymatriz4x4;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ud5_18arrayMatriz4x4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int [][] matrixFourByFour = new int [4][4];
       
       for (int i = 0; i < 4; i++) {
           System.out.println("Introduzca el primer numero de la fila " + (i+1) + ":");
           matrixFourByFour [i][0] = sc.nextInt();
           System.out.println("Introduzca el segundo numero de la fila " + (i+1) + ":");
           matrixFourByFour [i][1] = sc.nextInt();
           System.out.println("Introduzca el tercer numero de la fila " + (i+1) + ":");
           matrixFourByFour [i][2] = sc.nextInt();
           System.out.println("Introduzca el cuarto numero de la fila " + (i+1) + ":");
           matrixFourByFour [i][3] = sc.nextInt();
       }
       
         // Comprobar si la matriz es mágica
        if (isMagicMatrix(matrixFourByFour)) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz no es mágica.");
        }
    } 
     // Creamos una función para verificar si la matriz es mágica
    public static boolean isMagicMatrix(int[][] matrix) {
        int magicSum = 0;

        // Calculamos la suma de la primera fila, que sera nuestra referencia para la "suma mágica"
        for (int row = 0; row < 4; row++) {
            magicSum += matrix[0][row];
        }

        // Hacemos lo mismo, pero con un doble for para verificar las sumas de todas las filas
        for (int row = 1; row < 4; row++) { //i equivale nuevamente a las filas, j a las columnas
            int rowSum = 0;
            for (int column = 0; column < 4; column++) {
                rowSum += matrix[row][column];
            }
            if (rowSum != magicSum) {
                return false; // Si alguna fila no tiene la misma suma, no es mágica
            }
        }

        // Verificar las sumas de todas las columnas
        for (int column = 0; column < 4; column++) {
            int colSum = 0;
            for (int row = 0; row < 4; row++) {
                colSum += matrix[row][column];
            }
            if (colSum != magicSum) {
                return false; // Si alguna columna no tiene la misma suma, no es mágica
            }
        }
      return true;  
    }   
}

    
    
   
    

