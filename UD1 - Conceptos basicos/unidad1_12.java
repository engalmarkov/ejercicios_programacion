/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1act2angelespinosaglez;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Unidad1act2angelespinosaglez {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            int num;
            int result;
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            result = (7 - (num % 7)) % 7;
            System.out.println("El resultado es: " + result);
    }
}
