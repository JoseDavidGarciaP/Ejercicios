import java.util.HashMap;

public class Palindromos {

    // Método que determina si un número es palíndromo o si puede reordenarse para formar uno
    public static boolean isPalindrome(int numero) {

        // Convertimos el número a una cadena
        String numeroString = String.valueOf(numero);

        // Mapa para contar la frecuencia de cada dígito en el número
        HashMap<Character, Integer> contarDigitos = new HashMap<>();

        // Recorremos cada dígito y actualizamos su frecuencia en el mapa
        for (char digito : numeroString.toCharArray()) {
            contarDigitos.put(digito, contarDigitos.getOrDefault(digito, 0) + 1);
        }

        // Verificamos si el número es un palíndromo directo
        // Usamos StringBuilder para invertir la cadena
        String numeroInvertido = new StringBuilder(numeroString).reverse().toString();
        if (numeroString.equals(numeroInvertido)) {
            return true; // Si es palíndromo, retornamos true
        }

        // Si no es un palíndromo directo, verificamos si puede reordenarse para formar uno
        int impares = 0;
        // Contamos la cantidad de dígitos con frecuencia impar
        for (int frecuencia : contarDigitos.values()) {
            if (frecuencia % 2 != 0) { // Un palíndromo puede tener como máximo un dígito con frecuencia impar
                impares++;
            }
        }

        // Si hay 0 o 1 frecuencias impares, el número puede formar un palíndromo
        return impares <= 1;
    }

    // Método principal para probar el funcionamiento del programa
    public static void main(String[] args) {

        System.out.println("¿El número 5 es palíndromo? " + isPalindrome(5));
        System.out.println("¿El número 2121 es palíndromo? " + isPalindrome(2121));
        System.out.println("¿El número 1331 es palíndromo? " + isPalindrome(1331));
        System.out.println("¿El número 3357665 es palíndromo? " + isPalindrome(3357665));
        System.out.println("¿El número 1294 es palíndromo? " + isPalindrome(1294));
    }
}
