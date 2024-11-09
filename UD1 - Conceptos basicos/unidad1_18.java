/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1act8angelespinosaglez;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Unidad1act8angelespinosaglez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ants;
        int spiders;
        int cochineal;
        int totalLegs;
        
      System.out.println("Inserte el numero de hormigas capturadas:  ");
      ants = sc.nextInt();
      
      System.out.println("Inserte el numero de aranas capturadas:  ");
      spiders = sc.nextInt();
      
      System.out.println("Inserte el numero de cochinillas capturadas:  ");
      cochineal = sc.nextInt();
      
      totalLegs = (ants*6) + (spiders*8) + (cochineal*14);
      
      System.out.println("El numero total de patas de los insectos capturados es:  " + totalLegs);
               
    }
}
