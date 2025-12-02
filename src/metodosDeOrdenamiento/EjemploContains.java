package metodosDeOrdenamiento;
import java.util.ArrayList;

public class EjemploContains {
    public static void main(String[] args) {
        // Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        // Añadir elementos
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Verificar si la lista contiene el número 20
        boolean existe = numeros.contains(20);

        // Estructura de control para imprimir el resultado
        if (existe) {
            System.out.println("La lista contiene el número 20");
        }
    }
}