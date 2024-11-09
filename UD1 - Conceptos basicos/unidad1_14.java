/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1act4angelespinosaglez;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Unidad1act4angelespinosaglez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double triangleBase;
        double triangleHeight;
        double triangleArea; 
        //Declaramos las variables correspondientes a los lados del triángulo
        
        System.out.println("Introduce la base: ");    
        triangleBase = sc.nextDouble();
        System.out.println("Introduce la altura: ");
        triangleHeight = sc.nextDouble();
        //Pedimos que inserten las medidas del triángulo
        
        triangleArea = (triangleBase * triangleHeight) / 2;
        System.out.println("El área del triangulo es: " + triangleArea);
        
    }
}
