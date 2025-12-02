/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

import java.util.Arrays;

public class BusquedaArrays {
    // Autor: Coby
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 6};

        // 1. Ordenar el array (requerido para binarySearch)
        Arrays.sort(numeros); 
        // El array 'numeros' ahora es: {1, 2, 5, 6, 9}

        // 2. Buscar el elemento 6
        int index = Arrays.binarySearch(numeros, 6); 

        // 3. Imprimir el resultado
        if (index >= 0) {
            System.out.println("Encontrado en indice: " + index); // Imprime: Encontrado en indice: 3
        } else {
            System.out.println("No encontrado");
        }
    }
}