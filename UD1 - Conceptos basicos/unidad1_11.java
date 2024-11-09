/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1angelespinosaglez;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Unidad1actividad1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double taxBase;
        double iva; 
        double totalProduct; 
        double ivaResult;
        
        System.out.println("Inserte valor del producto: ");
        taxBase = sc.nextDouble();  
        
        System.out.println("Inserte el IVA aplicable al producto (entre 0 y 100): ");
        iva = sc.nextDouble(); //El IVA general en España es el 21% del valor de un producto
        ivaResult = taxBase * (iva/100); //Al ser el IVA un porcentaje, multiplicamos el valor introducido dividido entre 100
        
        System.out.println("El IVA total del producto es " + ivaResult);
        totalProduct = taxBase + ivaResult; 
        System.out.println("El importe total es " + totalProduct);          
    }
}
