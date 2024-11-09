/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1act7angelespinosaglez;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Unidad1act7angelespinosaglez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declaramos primero las variables, para posteriormente pedirselas al usuario
        double milimeters;
        double centimeters;
        double meters;
        double total;
        
        System.out.println("Inserte primero los milimetros:  ");
        milimeters = sc.nextDouble();
        
        System.out.println("Inserte ahora los centimetros:  ");
        centimeters = sc.nextDouble();
        
        System.out.println("Inserte ahora los metros:  ");
        meters = sc.nextDouble();
        
        total = (milimeters*0.1) + centimeters + (meters*100);
        
        System.out.println("La suma en centimetros de las tres longitudes introducidas es " + total + " centimetros");
             
    }
}
