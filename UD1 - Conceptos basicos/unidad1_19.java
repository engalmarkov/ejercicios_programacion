/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1act9angelespinosaglez;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Unidad1act9angelespinosaglez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double childTicketPrice;
        double adultTicketPrice;
        int childTicketNumber;
        int adultTicketNumber;
       
        double totalPrice;
        double discount;
        double percentage;
        boolean onSale;
        
        
        childTicketPrice = 15.50;
        adultTicketPrice = 20;
        percentage = 0.95;
        
        System.out.println("Inserte el numero de entradas para niños:  ");
        childTicketNumber = sc.nextInt();
        
        System.out.println("Inserte el numero de entradas para adultos:  ");
        adultTicketNumber = sc.nextInt();
        
        totalPrice = childTicketNumber*childTicketPrice + adultTicketNumber*adultTicketPrice;
        onSale = totalPrice > 100; 
        discount = totalPrice * percentage;
        totalPrice = onSale ? discount : totalPrice;
        
        System.out.println("El resultado total es:  " + totalPrice);
        
        sc.close();
    }
    
}
