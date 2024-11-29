import java.text.Normalizer;
import java.text.Normalizer.Form;

public class Isogramas {

    // Método para verificar si una palabra es un isograma (sin letras repetidas)
    public static boolean isIsogram(String palabra) {

        // Verificar si la cadena está vacía
        if (palabra.isEmpty()) {
            return true; // Una cadena vacía es un isograma
        }

        // Verificar si la palabra contiene espacios (dos palabras no pueden ser un isograma)
        if (palabra.contains(" ")) {
            return false;
        }

        // Normalizar la palabra: eliminar acentos y convertirla a minúsculas
        palabra = normalizarSinAcentos(palabra).toLowerCase();

        // Convertir la palabra en un arreglo de caracteres
        char[] caracteresPalabra = palabra.toCharArray();

        // Comparar cada letra con las siguientes en el arreglo
        for (int i = 0; i < caracteresPalabra.length; i++) {
            for (int j = i + 1; j < caracteresPalabra.length; j++) {
                if (caracteresPalabra[i] == caracteresPalabra[j]) {
                    return false; // Si hay letras repetidas, no es un isograma
                }
            }
        }

        // Si no hay letras repetidas, la palabra es un isograma
        return true;
    }

    // Método para normalizar una palabra eliminando acentos y marcas diacríticas
    public static String normalizarSinAcentos(String palabra) {
        // Normaliza la palabra a la forma NFD (Descomposición) para separar letras y acentos
        String palabraNormalizada = Normalizer.normalize(palabra, Form.NFD);
        // Elimina los caracteres no ASCII (acentos y marcas diacríticas)
        return palabraNormalizada.replaceAll("[^\\p{ASCII}]", "");
    }

    // Método principal para probar el funcionamiento del programa
    public static void main(String[] args) {
        System.out.println(isIsogram("")); // true (cadena vacía)
        System.out.println(isIsogram("reto")); // true (no tiene letras repetidas)
        System.out.println(isIsogram("múrcielago")); // true (es un isograma, sin considerar acentos)
        System.out.println(isIsogram("PeRrO")); // false (tiene dos 'r')
        System.out.println(isIsogram("GaTo")); // true (no tiene letras repetidas)
        System.out.println(isIsogram("dos palabras")); // false (contiene espacios)
    }
}
