// Clase Rectangulo con atributos ancho y alto
class Rectangulo {
    int ancho;
    int alto;

    // Constructor para inicializar el rectángulo con valores de ancho y alto
    Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}

public class Ejercicio2 {

    // Método que modifica los atributos de un objeto Rectangulo
    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 50;  // Modificar el ancho
        r.alto = 30;   // Modificar el alto
        System.out.println("Dentro del método: ancho = " + r.ancho + ", alto = " + r.alto);
    }

    public static void main(String[] args) {
        // Crear un objeto Rectangulo con ancho 10 y alto 20
        Rectangulo miRectangulo = new Rectangulo(10, 20);
        
        // Mostrar los valores iniciales del rectángulo
        System.out.println("Antes de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);

        // Llamar al método que modifica el rectángulo
        modificarRectangulo(miRectangulo);

        // Mostrar los valores después de modificar el rectángulo
        System.out.println("Después de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
    }
}
