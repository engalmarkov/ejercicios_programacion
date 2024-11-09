/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1act12angelespinosaglez;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Unidad1act12angelespinosaglez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double metersLength;
        double centimetersLength;
        int metersRound;
        
       System.out.println("Inserte la distancia de lanzamiento en metros: "); //Introducir los decimales utilizando comas
       metersLength = sc.nextDouble();
       centimetersLength = metersLength * 100;
       metersRound = (int) centimetersLength;
       
       
       System.out.println("La distancia medida en centímetros es: " + metersRound);
       
    }
}
