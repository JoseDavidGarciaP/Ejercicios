import java.util.ArrayList;
import java.util.HashSet;

public class RepeatedElements {

    // Método genérico para obtener elementos repetidos en cantidad par
    public static <T> HashSet<T> obtenerRepetidosPares(ArrayList<T> elementos) {
        // Usamos un HashSet para almacenar los resultados sin duplicados
        HashSet<T> resultadosRepetidos = new HashSet<>();

        // Recorremos cada elemento en la lista
        for (T elem : elementos) {
            int contadorElementos = 0;

            // Comparamos el elemento actual con todos los elementos de la lista
            for (T e : elementos) {
                if (e.equals(elem)) { // Incrementamos el contador si hay coincidencia
                    contadorElementos++;
                }
            }

            // Si la cantidad de repeticiones es par, lo añadimos al conjunto de resultados
            if (contadorElementos % 2 == 0) {
                resultadosRepetidos.add(elem);
            }
        }

        // Retornamos el conjunto con los elementos repetidos en cantidad par
        return resultadosRepetidos;
    }

    public static void main(String[] args) {
        // Lista de cadenas (Strings)
        ArrayList<String> elementosString = new ArrayList<>();
        elementosString.add("A");
        elementosString.add("B");
        elementosString.add("A");
        elementosString.add("C");
        elementosString.add("C");
        elementosString.add("C");
        elementosString.add("C");

        // Imprimimos los Strings repetidos en cantidad par
        System.out.println("Strings repetidos: " + obtenerRepetidosPares(elementosString));

        // Lista de enteros (Integer)
        ArrayList<Integer> elementosInt = new ArrayList<>();
        elementosInt.add(1);
        elementosInt.add(2);
        elementosInt.add(3);
        elementosInt.add(1);
        elementosInt.add(2);

        // Imprimimos los enteros repetidos en cantidad par
        System.out.println("Enteros repetidos: " + obtenerRepetidosPares(elementosInt));
    }
}
