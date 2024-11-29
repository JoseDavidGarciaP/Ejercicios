public class Ejercicio4 {

    // Método que recibe un entero, lo incrementa en 1 y lo retorna
    public static int incrementar(int x) {
        x += 1;  // Incrementar el valor de x en 1
        System.out.println("Dentro del método: x = " + x);
        return x;  // Retornar el valor modificado
    }

    public static void main(String[] args) {
        int x = 5;  // Definir un valor inicial para x
        System.out.println("Antes de llamar al método: x = " + x);  // Imprimir el valor antes de llamar al método

        // Llamar al método y asignar el valor retornado a x
        x = incrementar(x);

        // Imprimir el valor de x después de modificarlo dentro del método
        System.out.println("Después de llamar al método: x = " + x);
    }
}
