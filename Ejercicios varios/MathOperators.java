/*Escribe un programa en Java que pida al usuario que introduzca dos números y realice las cinco operaciones aritméticas básicas (suma, resta, multiplicación, división, y módulo), mostrando el resultado de cada una.*/

import java.util.Scanner;

class MathOperators
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Ingrese el valor del primer numero");
        float primerNumero = scanner.nextFloat();
        System.out.print("Ingrese el valor del segundo numero");
        double segundoNumero = scanner.nextDouble();
        
        double suma = primerNumero + segundoNumero;
        double resta = primerNumero - segundoNumero;
        double multiplicación = primerNumero * segundoNumero;
        double division = primerNumero / segundoNumero;
        double modulo = primerNumero % segundoNumero;
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicación);
        System.out.println("El resultado de la division es: " + division);
        System.out.println("El resultado del modulo es: " + modulo);

        scanner.close();
    }
}
