package metodosDeOrdenamiento;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EjemploStream {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Luis", "Alberto", "Bea");
        
        // Filtrar nombres que empiezan con 'A'
        List<String> resultado = nombres.stream()
            .filter(n -> n.startsWith("A"))
            .collect(Collectors.toList());

        System.out.println(resultado);
    }
}