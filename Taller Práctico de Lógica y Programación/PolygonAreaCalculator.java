import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PolygonAreaCalculator {

    // Función que normaliza una cadena para eliminar tildes
    public static String normalize(String input) {
        // Normaliza la cadena y elimina las tildes
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("").toLowerCase();
    }
    

    // Función que calcula el área de un polígono
    public static double calculateArea(String polygon, double... dimensions) {
        String normalizedPolygon = normalize(polygon); // Normalizamos el nombre del polígono

        switch (normalizedPolygon) {
            case "triangulo":
                // El área de un triángulo es (base * altura) / 2
                if (dimensions.length == 2) {
                    return (dimensions[0] * dimensions[1]) / 2;
                } else {
                    throw new IllegalArgumentException("Se requieren 2 dimensiones: base y altura.");
                }
            case "cuadrado":
                // El área de un cuadrado es lado * lado
                if (dimensions.length == 1) {
                    return dimensions[0] * dimensions[0];
                } else {
                    throw new IllegalArgumentException("Se requiere 1 dimensión: lado.");
                }
            case "rectangulo":
                // El área de un rectángulo es base * altura
                if (dimensions.length == 2) {
                    return dimensions[0] * dimensions[1];
                } else {
                    throw new IllegalArgumentException("Se requieren 2 dimensiones: base y altura.");
                }
            default:
                throw new IllegalArgumentException("Tipo de polígono no soportado: " + polygon);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de polígono (triángulo, cuadrado, rectángulo): ");
        String polygon = scanner.nextLine();

        double area = 0.0;

        switch (normalize(polygon)) {
            case "triangulo":
                System.out.print("Ingrese la base del triángulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double alturaTriangulo = scanner.nextDouble();
                area = calculateArea(polygon, baseTriangulo, alturaTriangulo);
                break;

            case "cuadrado":
                System.out.print("Ingrese el lado del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();
                area = calculateArea(polygon, ladoCuadrado);
                break;

            case "rectangulo":
                System.out.print("Ingrese la base del rectángulo: ");
                double baseRectangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double alturaRectangulo = scanner.nextDouble();
                area = calculateArea(polygon, baseRectangulo, alturaRectangulo);
                break;

            default:
                System.out.println("Tipo de polígono no soportado.");
                break;
        }

        System.out.println("El área del " + polygon + " es: " + area);
        scanner.close();
    }
}
