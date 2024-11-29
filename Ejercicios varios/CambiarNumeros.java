import java.util.Scanner;
public class CambiarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int number1 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int number2 = scanner.nextInt();

        number1 = (number1 + number2);
        number2 = (number1-number2);
        number1 = (number1-number2);
        System.out.println("El numero 1 ahora es: " + number1);
        System.out.println("El numero 2 ahora es: " + number2);
    }
}
