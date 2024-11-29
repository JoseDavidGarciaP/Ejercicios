public class Ejercicio1 {

    // Método que intenta intercambiar los valores de dos variables enteras
    public static void intercambiar(int a, int b) {
        int tempA = a; // Guardar el valor de 'a' en una variable temporal
        a = b;         // Asignar el valor de 'b' a 'a'
        b = tempA;     // Asignar el valor guardado en 'tempA' a 'b'
        System.out.println("Dentro del método: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        // Declaración e inicialización de las variables
        int a = 5;
        int b = 10;

        // Mostrar los valores antes de llamar al método
        System.out.println("Antes de llamar al método: a = " + a + ", b = " + b);

        // Llamada al método intercambiar
        intercambiar(a, b);

        // Mostrar los valores después de llamar al método
        System.out.println("Después de llamar al método: a = " + a + ", b = " + b);
    }
}
