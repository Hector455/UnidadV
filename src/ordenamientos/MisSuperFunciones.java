/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList; // Nota: ArrayList se usa para la inicialización en la imagen, aunque Arrays.asList también es válido.

/*
 * Uso de Collections.sort
 * @author coby_
 */
public class MisSuperFunciones {
    public static void main(String[] args) {
        // Crea una lista a partir de los elementos {5, 2, 9, 1}
        List<Integer> lista = Arrays.asList(5, 2, 9, 1);
        
        // Ordena la lista
        Collections.sort(lista);
        
        System.out.println(lista); // Imprime: [1, 2, 5, 9]
    }
}