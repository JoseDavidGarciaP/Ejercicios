import java.util.ArrayList;

public class moverCeros {

    // Método para mover los ceros al final de la lista
    public static ArrayList<Object> cambiarCeros(ArrayList<Object> numeros) {

        // Lista para almacenar los resultados
        ArrayList<Object> resultado = new ArrayList<>();

        // Primera pasada: agregar todos los elementos que no sean ceros
        for (Object numero : numeros) {
            if (numero instanceof Integer && (Integer) numero != 0) {
                resultado.add(numero);  // Agregar los números diferentes de 0
            } else if (!(numero instanceof Integer)) {
                resultado.add(numero);  // Agregar otros objetos (como "false", "a", etc.)
            }
        }

        // Segunda pasada: agregar todos los ceros al final
        for (Object numero : numeros) {
            if (numero instanceof Integer && (Integer) numero == 0) {
                resultado.add(0);  // Agregar los ceros al final
            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        // Lista de entrada que mezcla números, objetos y ceros
        ArrayList<Object> numeros = new ArrayList<>();
        numeros.add("false");
        numeros.add(1);
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(0);
        numeros.add(1);
        numeros.add(3);
        numeros.add("a");

        // Imprimir la lista original
        System.out.println("Lista original: " + numeros);

        // Aplicar el método para mover los ceros al final
        ArrayList<Object> respuesta = cambiarCeros(numeros);

        // Imprimir la lista resultante
        System.out.println("Lista con ceros al final: " + respuesta);
    }
}
