import java.text.Normalizer;
import java.util.regex.Pattern;
import java.util.Scanner;

public class StringTerminaCon {

    // Método para normalizar una palabra eliminando acentos
    public static String normalizarSinAcentos(String palabra) {
        System.out.println("Original: " + palabra); // Depuración
        // Normaliza la cadena y elimina las tildes
        String normalized = Normalizer.normalize(palabra, Normalizer.Form.NFD);
        System.out.println("Normalizado (NFD): " + normalized); // Depuración
        Pattern pattern = Pattern.compile("\\p{M}+");
        String sinAcentos = pattern.matcher(normalized).replaceAll("").toLowerCase();
        System.out.println("Sin acentos: " + sinAcentos); // Depuración
        return sinAcentos;
    }

    // Método para verificar si una palabra termina con otra
    public static boolean terminaCon(String palabra1, String palabra2) {
        // Normalizar ambas palabras sin tildes y convertir a minúsculas
        palabra1 = normalizarSinAcentos(palabra1);
        palabra2 = normalizarSinAcentos(palabra2);

        return palabra1.endsWith(palabra2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la palabra a verificar:");
        String palabra1 = scanner.nextLine();
        System.out.println("Ingresa la otra palabra:");
        String palabra2 = scanner.nextLine();

        // Verificar si palabra1 termina con palabra2
        boolean resultado = terminaCon(palabra1, palabra2);
        System.out.println("La palabra \"" + palabra1 + "\" " + (resultado ? "sí" : "no") + " termina con \"" + palabra2 + "\".");

        scanner.close();
    }
}
