/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosDeOrdenamiento;

/**
 *
 * @author LENOVO
 */

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EjemplosStream {
    // Autor: Coby
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Luis", "Alberto", "Bea");
        
        // Filtrar nombres que empiezan con 'A'
        List<String> resultado = nombres.stream()
            .filter(n -> n.startsWith("A"))
            .collect(Collectors.toList());

        System.out.println(resultado); // Imprime: [Ana, Alberto]
    }
}    

