/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud5_13desordenarmodificado;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author angel
 */
public class Ud5_13desordenarModificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int t [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //Declaramos el array con un indice ordenado de 0 a 9
        //Mostramos en pantalla el array pasándolo a string
        System.out.println("Array original: " + Arrays.toString(t)); 
        
        //Llamamos a la función que pide el ejercicio, donde se cambiará el número por uno aleatorio haciendo copia del array
      desordenar(t); 
       
    }
    
    public static void desordenar (int t[]) {
        int[] copyOfT = Arrays.copyOf(t, t.length); //Creamos una copia del array T, con sus mismos elementos e indices 
        Random random = new Random ();
        for (int i = copyOfT.length - 1; i > 0; i--){ //Establecemos la condición del bucle
            //i empieza en la ultima posición del array, en este caso el 9, por eso le ponemos el -1.
            //de no poner el -1 lo haría desde el índice 10, que no existe en nuestro array ya que va de 0 a 9.
            //EL bucle continúa mientras i sea mayor que 0, ya que es el primer número de nuestro array. 
            //Ponemos como actualizacion que i disminuya en 1, avanzando así de derecha a izquierda.
        int j = random.nextInt(i + 1); 
        //Indicamos que genere un numero aleatorio entre 0 e i+1 para que el valor máximo del array no se quede fuera del rango del random
        int tempI = copyOfT[i]; 
        //declaramos una variable que nos servirá para almacenar temporalmente el valor de i y así asignarselo a j
        copyOfT[i] = copyOfT[j];
        copyOfT[j] = tempI;     
      }
      System.out.println("Array desordenado: " + Arrays.toString(copyOfT));   
    }
}