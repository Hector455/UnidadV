
package ordenamientos;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ejemplo de ordenamiento Quicksort
 * @author LENOVO
 */

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[5];

        // Pedir nombres
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingresa el nombre " + (i+1) + ": ");
            nombres[i] = sc.nextLine();
        }

        // Ordenar
        quicksort(nombres, 0, nombres.length - 1);

        // Imprimir ordenados
        System.out.println("Nombres ordenados:");
        System.out.println(Arrays.toString(nombres));
    }

    /**
     * metodo recursivo
     * @param arr
     * @param inicio
     * @param fin 
     */
    public static void quicksort(String[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pivoteFinal = acomodaPivote(arr, inicio, fin);
            quicksort(arr, inicio, pivoteFinal - 1);
            quicksort(arr, pivoteFinal + 1, fin);// 
        }
    }

    // Partición para Strings
    public static int acomodaPivote(String[] arr, int inicial, int fin) {
        String pivote = arr[fin];
        int posIntercambio = inicial - 1;

        for (int i = inicial; i < fin; i++) {
           
            if (arr[i].compareToIgnoreCase(pivote) <= 0) {
                posIntercambio++;
                String aux = arr[posIntercambio];
                arr[posIntercambio] = arr[i];
                arr[i] = aux;
            }
        }

        // Intercambiar pivote
        String aux = arr[posIntercambio + 1];
        arr[posIntercambio + 1] = arr[fin];
        arr[fin] = aux;

        return posIntercambio + 1;
    }
}