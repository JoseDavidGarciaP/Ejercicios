import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean areAnagrams(String word1, String word2) {
        // Convertimos las palabras a minúsculas para ignorar diferencias entre mayúsculas y minúsculas
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        // Si las palabras tienen diferentes longitudes, no pueden ser anagramas
        if (word1.length() != word2.length()) {
            return false;
        }
        
        // Convertimos ambas palabras a arreglos de caracteres
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        
        // Ordenamos los arreglos de caracteres
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        // Comparamos los arreglos de caracteres ordenados
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la primera palabra
        System.out.print("Ingresa la primera palabra: ");
        String word1 = scanner.nextLine();

        // Pedir al usuario que ingrese la segunda palabra
        System.out.print("Ingresa la segunda palabra: ");
        String word2 = scanner.nextLine();

        // Llamar al método para verificar si son anagramas
        if (areAnagrams(word1, word2)) {
            System.out.println(word1 + " y " + word2 + " son anagramas.");
        } else {
            System.out.println(word1 + " y " + word2 + " no son anagramas.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
