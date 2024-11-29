public class FizzBuzz {

    public static void main(String[] args) {
        final int NUMBER_MAX = 100;
        // Recorremos los números del 1 al 100
        for (int i = 1; i <= NUMBER_MAX ; i++) {
            // Verificamos si es divisible por 3 y por 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            // Verificamos si es divisible solo por 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            // Verificamos si es divisible solo por 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            // Si no es divisible ni por 3 ni por 5, imprimimos el número
            else {
                System.out.println(i);
            }
        }
    }
}
