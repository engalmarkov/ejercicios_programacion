/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1act3;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Unidad1act3 {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            int n;
            int m;
            int result;
            System.out.println("Introduce el primer numero: ");
            n = sc.nextInt();
            System.out.println("Introduce el segundo numero: ");
            m = sc.nextInt();
            result = (m - (n % m)) % m;
            System.out.println("El resultado es: " + result);
    }
}
