public class FibonacciSequence {

    public static void main(String[] args) {
        // Definimos los dos primeros números de la sucesión de Fibonacci
        final int NUMBER_MAX = 50;
        long previousNumber = 0;
        long currentNumber = 1;

        // Imprimimos el primer número de la sucesión
        System.out.println(previousNumber);

        // Recorremos para imprimir los siguientes 49 números
        for (int i = 1; i < NUMBER_MAX; i++) {
            System.out.println(currentNumber);
            
            // Calculamos el siguiente número en la sucesión
            long nextNumber = previousNumber + currentNumber;
            
            // Actualizamos los valores para la siguiente iteración
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
    }
}
