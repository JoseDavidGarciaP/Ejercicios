public class Ejercicio5 {

    // Método que intenta modificar una cadena
    public static void modificarCadena(String texto) {
        texto = texto + " modificado";  // Intentar modificar la cadena
        System.out.println("Dentro del método: " + texto);  // Imprimir el valor de texto dentro del método
    }

    public static void main(String[] args) {
        String textoOriginal = "Hola";  // Cadena original
        System.out.println("Antes de modificar: " + textoOriginal);  // Imprimir la cadena antes de llamar al método

        // Llamar al método que intenta modificar la cadena
        modificarCadena(textoOriginal);

        // Imprimir el valor de textoOriginal después de la llamada, para verificar que no cambió
        System.out.println("Después de modificar: " + textoOriginal);  // No cambia
    }
}
