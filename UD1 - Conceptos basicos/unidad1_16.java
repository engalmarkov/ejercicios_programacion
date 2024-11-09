/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1act6angelespinosaglez;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Unidad1act6angelespinosaglez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds;
        double minutes;
        double hours;
        
        System.out.println("Inserte los segundos: ");
        seconds = sc.nextInt();
        
        minutes = seconds / 60; // Teniendo en cuenta que un minuto son sesenta segundos, dividimos entre 60 para obtener los minutos
        System.out.println("Los segundos introducidos equivalen a " + minutes + " minutos");
        
        hours = minutes / 60; //Como una hora son 60 minutos, le asignamos la variable minutos divida entre 60 para obtener las horas
        System.out.println("Los segundos introducidos equivalen a " + hours + " horas");
    }
}
