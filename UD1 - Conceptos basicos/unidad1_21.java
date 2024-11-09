/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1act11angelespinosaglez;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Unidad1act11angelespinosaglez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numA;
        double numB;
        boolean sameNumber;
        
         System.out.println("Inserte el valor de a: ");
         numA = sc.nextDouble();
         
         System.out.println("Inserte el valor de b: ");
         numB = sc.nextDouble();
         
        sameNumber = numA == numB;
        System.out.println("Los numeros son iguales es: " + sameNumber);
        
        sc.close();        
    }
}
