import java.util.Scanner;

public class PrimeNumber {

    // Método para determinar si un número es primo
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 y 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Encontró un divisor, no es primo
            }
        }
        return true; // Es primo
    }

    // Método para imprimir todos los números primos entre 1 y 100
    public static void printPrimesUpTo100() {
        System.out.println("Números primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // Imprime el número primo
            }
        }
        System.out.println(); // Nueva línea al final
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada del usuario
        System.out.print("Ingrese un número para determinar si es primo: ");
        int userInput = scanner.nextInt();
        
        // Verificación si el número ingresado es primo
        if (isPrime(userInput)) {
            System.out.println(userInput + " es un número primo.");
        } else {
            System.out.println(userInput + " no es un número primo.");
        }
        
        // Imprimir todos los números primos entre 1 y 100
        printPrimesUpTo100();

        scanner.close(); // Cerrar el escáner
    }
}
