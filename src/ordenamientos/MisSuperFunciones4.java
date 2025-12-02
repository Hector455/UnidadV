/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

/**uso de Stream
 * @author LENOVO
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
* Uso de Streams
* @author coby_
*/
public class MisSuperFunciones4 {
    
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
            new Persona("Ana", 100),
            new Persona("Luts", 90),
            new Persona("Marta", 62),
            new Persona("Cobian", 87)
        );

        personas.sort(Comparator.comparingInt(p -> p.calificacion()));
        Arrays.stream(personas.toArray()).forEach(System.out::println);
    }
}