/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MisSuperFunciones3 {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5, 2, 9, 1);
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);
    }
}