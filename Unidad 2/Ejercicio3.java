import java.util.Arrays;  // Importar la clase Arrays para facilitar la impresión de arrays

public class Ejercicio3 {

    // Método que recibe un array de enteros y modifica sus valores
    public static void modificarArray(int[] arr) {
        // Multiplica cada valor del array por 2
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;  // Doble del valor de cada elemento
        }
        // Imprime el contenido del array dentro del método
        System.out.println("Dentro del método: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Crear un array de enteros
        int[] numeros = {1, 2, 3, 4, 5};
        
        // Mostrar el array antes de modificar
        System.out.println("Antes de modificar: " + Arrays.toString(numeros));

        // Llamar al método que modifica el array
        modificarArray(numeros);

        // Mostrar el array después de modificar
        System.out.println("Después de modificar: " + Arrays.toString(numeros));
    }
}
