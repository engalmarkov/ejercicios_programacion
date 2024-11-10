/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud5_14encuestasayuntamiento;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ud5_14encuestasAyuntamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        double salarySum = 0; // variable que acumula los salarios para calcular la media
        double maxSalary = Double.MIN_VALUE; // Variable para almacenar el sueldo máximo, poniendo que es el minimo garantiza que siempre almacene maximo
        double minSalary = Double.MAX_VALUE; // Variable para almacenar el sueldo mínimo, poniendo que es el maximo garantiza que siempre almacene minimo
        //Si pusieramos 0 en minSalary, siempre nos daria 0. Por eso, debemos poner el valor máximo del double, para que siempre guarde el mas pequeño
        int salaryCount = 0; // Contador de sueldos introducidos
        boolean continueInput = true; //Booleano para controlar la entrada de datos en el bucle

        System.out.println("Introduce los salarios de los participantes de la encuesta (Pulsa -1 para terminar):");

        // Entrada de datos
        while (continueInput) {
            System.out.print("Salario: ");
            double salary = scanner.nextDouble();
            if (salary == -1) {
                continueInput = false; // Finaliza la entrada de datos y el programa
            } else if (salary < 0) { //Si el salario es negativo, pero no -1, no se tiene en cuenta y se continua
                System.out.println("No pueden haber salarios negativos, inserte otro valor.");
            }
                else{
            // Actualizamos suma, máximo y mínimo
            salarySum += salary; //Hacemos un suma y sigue de los salarios para poder calcular la media mas adelante
            if (salary > maxSalary) {
                maxSalary = salary;
            }
            if (salary < minSalary) {
                minSalary = salary;
            }
            salaryCount++;
        }

        if (salaryCount == 0) {
            System.out.println("No se introdujeron salarios.");
            return; // En caso de que no se introduzcan sueldos. 
        }      
    }  
        // Calcular la media de los sueldos
        double averageSalary = salarySum / salaryCount;
        // Mostramos resultados
        System.out.println("Numero de salarios introducidos: " + salaryCount);
        System.out.println("Salario maximo introducido: " + maxSalary);
        System.out.println("Salario minimo introducido: " + minSalary);
        System.out.println("Salario promedio: " + averageSalary);
  } 
 } 

