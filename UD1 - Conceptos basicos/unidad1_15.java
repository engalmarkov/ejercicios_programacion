/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1act5angelespinosaglez;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Unidad1act5angelespinosaglez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x;
        double y; //Declaramos las variables
        
        System.out.println("Inserte el valor de a: ");
        a = sc.nextDouble();
        System.out.println("Inserte el valor de b: ");
        b = sc.nextDouble();
        System.out.println("Inserte el valor de c: ");
        c = sc.nextDouble();
        System.out.println("Inserte el valor de x: ");
        x = sc.nextDouble(); //Pedimos que introduzcan los valores
        
        y = a * Math.pow(x, 2) + b * x + c;
        System.out.println("El valor de y es: " + y);        
    }
}
