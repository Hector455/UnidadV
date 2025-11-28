package ordenamientos;

import java.util.Arrays;
import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String nombres[] = new String[5];

        // leer los nombres correctamente
        for (int o = 0; o < nombres.length; o++) {
            System.out.print("Ingrese nombre " + (o+1) + ": ");
            nombres[o] = leer.nextLine();
        }

        int vueltas = 1;

        for (int j = 0; j < nombres.length - 1; j++) {
            for (int i = 0; i < nombres.length - (j + 1); i++) {

                // comparar cadenas de texto (alfabetico)
                if (nombres[i].compareToIgnoreCase(nombres[i + 1]) > 0) {

                    String aux = nombres[i];
                    nombres[i] = nombres[i + 1];
                    nombres[i + 1] = aux;
                }

                System.out.println(vueltas + ": " + Arrays.toString(nombres));
                vueltas++;
            }
        }
    }
}