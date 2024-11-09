/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1act10angelespinosaglez;

/**
 *
 * @author angel
 */
public class Unidad1act10angelespinosaglez {

    public static void main(String[] args) {
        double number;
        double squareRoot;
                
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Introduce un número real: ");
        number = scanner.nextDouble();
        
        squareRoot = java.lang.Math.sqrt(number);
        
        System.out.println("La raíz cuadrada de " + number + " es: " + squareRoot);
        
        scanner.close();
    }
}
