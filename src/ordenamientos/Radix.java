// pedir cuantos digitos quiere ordenar y meter los digitos al arreaglo
package ordenamientos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * clase que permite ordenar los valores por sus columnas
 * @author LENOVO
 */
public class Radix {

    private static void ordenarPorColumnas(int[] numeros, int exp) {
        int cant = numeros.length;
        int[] ordenado = new int[cant];
        int[] posiciones = new int[10];

        // crear un acumulado de las posiciones 
        for (int i = 0; i < cant; i++) {
            int digito = (numeros[i] / exp) % 10;
            posiciones[digito]++;
        }

        // crear un arreglo acumulado en orden
        for (int i = 1; i < 10; i++) {
            posiciones[i] += posiciones[i - 1];
        }

        // crear el arreglo ordenado
        for (int i = cant - 1; i >= 0; i--) {
            int digito = (numeros[i] / exp) % 10;
            int posicionFinal = posiciones[digito] - 1;
            ordenado[posicionFinal] = numeros[i];
            posiciones[digito]--;
        }

        System.arraycopy(ordenado, 0, numeros, 0, cant);
    }

    public static void radixSort(int[] numeros) {
        // obtener el valor mayor del arreglo
        int max = Arrays.stream(numeros).max().orElseThrow();
        System.out.println("El mayor es " + max);

        for (int exp = 1; (max / exp) > 0; exp *= 10) {
            ordenarPorColumnas(numeros, exp);
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Algoritmo Radix Sort");
        System.out.print("¿Cuántos valores deseas ingresar?: ");
        int n = leer.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el valor " + (i + 1) + ": ");
            numeros[i] = leer.nextInt();
        }

        radixSort(numeros);

        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
    }
}
