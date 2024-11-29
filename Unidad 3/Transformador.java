import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Transformador {

    // Método para transformar datos en una lista de mapas
    // Retorna un ArrayList donde cada elemento es un mapa con claves String y valores Object
    public static List<Map<String, Object>> transformadorData(Map<String, List<?>> data) {

        // Lista que almacenará los mapas representando cada persona
        List<Map<String, Object>> output = new ArrayList<>();

        // Se extraen las listas asociadas a las claves "nombres" y "edades"
        List<String> nombres = (List<String>) data.get("nombres"); // Casting explícito a List<String>
        List<Integer> edades = (List<Integer>) data.get("edades"); // Casting explícito a List<Integer>

        // Iteramos sobre las listas para construir los mapas de cada persona
        for (int i = 0; i < nombres.size(); i++) {
            Map<String, Object> persona = new HashMap<>(); // Mapa para representar a una persona
            persona.put("id", String.valueOf(i + 1)); // Asignamos un ID basado en la posición
            persona.put("nombre", nombres.get(i)); // Asociamos el nombre
            persona.put("edad", edades.get(i)); // Asociamos la edad

            output.add(persona); // Agregamos el mapa al listado de salida
        }

        return output; // Retornamos la lista de mapas
    }

    public static void main(String[] args) {
        // Creación del mapa de entrada `data` con claves de tipo String y valores de tipo List
        Map<String, List<?>> data = new HashMap<>();

        // Asignamos las listas de nombres y edades a las claves correspondientes
        data.put("nombres", List.of("Bruno", "Andrea")); // `List.of` crea una lista inmutable
        data.put("edades", List.of(20, 19));

        // Transformamos los datos y almacenamos el resultado
        List<Map<String, Object>> resultado = transformadorData(data);

        // Imprimimos el resultado
        System.out.println(resultado);
    }
}
