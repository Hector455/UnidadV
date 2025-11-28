
package ordenamientos;

import java.util.Arrays;

/**
 *clase que permite ordenar los valores por sus columnas
 * @author LENOVO
 */
public class Radix {
    public static void radixSort(int[]numeros){
        // obtener el valor mayor del arreglo
        int max= Arrays.stream(numeros).max().orElseThrow();
        System.out.println("el mayor es "+ max);
    }
    public static void main(String[] args) {
        System.out.println("algoritmo radix");
        
        int[] numeros = {329,457,657,839,436,720,355};
        radixSort(numeros);
        
        System.out.println(Arrays.toString(numeros));
    }
    

}
