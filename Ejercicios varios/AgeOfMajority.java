/* Declara y asigna valores a variables que representen la edad, altura, inicial del nombre, y si una persona es mayor de edad o no. */

public class AgeOfMajority
{
    public static void main(String[] args) {
        int age = 20;
        double height = 1.68;
        char initialOfTheName = 'J';
        boolean isEqual = (age>=18);
        System.out.println("¿Es mayor de edad?: " + isEqual);
    }
}
