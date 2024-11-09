/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud5_11buscartodos;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ud5_11buscarTodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // Definimos el tamaño del array, en este caso de 10 elementos, del indice 0 al 9
        int arraySize = 10;  
        int[] t = new int[arraySize];
        
        // Llenamos el array con números aleatorios entre 0 y 10 para que haya mayor probabilidad de repeticion
        for (int i = 0; i < arraySize; i++) {
            t[i] = (int)(Math.random() * 11);  // Números aleatorios entre 0 y 10 en el array
        }
        
        // Mostramos el array generado
        System.out.print("Arreglo generado: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
        
       // Pedimos al usuario que ingrese la clave a buscar
        System.out.print("Ingresa la clave a buscar: ");
        int clave = scanner.nextInt();

        // Llamamos a la función buscarTodos y así obtener los índices
        int[] foundAll = buscarTodos(t, clave);

        // Mostramos los resultados
        if (foundAll.length == 0) {
            System.out.println("La clave no fue encontrada en el array.");
        } else {
            System.out.print("La clave se encuentra en los indices: ");
            for (int i = 0; i < foundAll.length; i++) {
                System.out.print(foundAll[i] + " ");
            }
            System.out.println();
        }
    }
       
    public static int[] buscarTodos(int t[], int clave) {
        // Primero, contamos cuántas veces aparece la clave en el array para saber el tamaño del nuevo array
        int claveCounter = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                claveCounter++;
            }
        }

        // Si la clave no está en el array, devolvemos un array vacío como pide el ejercicio
        if (claveCounter == 0) {
            return new int[0];
        }

        // Si la clave está presente, creamos un nuevo array con el tamaño de 'claveCounter'
        int[] indexFromCounter = new int[claveCounter];
        int indiceActual = 0;

        // Recorremos el array de nuevo y guardamos los índices donde se encuentra la clave
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                indexFromCounter[indiceActual] = i;
                indiceActual++;
            }
        }
        return indexFromCounter;
    }
}
