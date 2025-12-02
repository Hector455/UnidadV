package metodosDeOrdenamiento;
import java.util.ArrayList;

public class EjemploIndexOf {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        int indice = frutas.indexOf("Naranja");

        if (indice != -1) {
            System.out.println("Naranja está en el indice: " + indice);
        } else {
            System.out.println("No encontrado");
        }
    }
}