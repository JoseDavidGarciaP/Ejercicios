import java.util.Scanner;

public class OperacionesMatrices {

    // Método para imprimir una matriz
    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.print("|");
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filaA, columnaA, filaB, columnaB;

        while (true) {
            // Mostrar el menú
            System.out.println("\n--- Menú ---");
            System.out.println("1. Sumar matrices");
            System.out.println("2. Restar matrices");
            System.out.println("3. Multiplicar matrices");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 4) {
                System.out.println("Saliendo del programa...");
                break; // Salir del programa
            }

            // Solicitar las dimensiones de las matrices
            System.out.println("Ingrese el número de filas de la matriz A:");
            filaA = sc.nextInt();
            System.out.println("Ingrese el número de columnas de la matriz A:");
            columnaA = sc.nextInt();
            System.out.println("Ingrese el número de filas de la matriz B:");
            filaB = sc.nextInt();
            System.out.println("Ingrese el número de columnas de la matriz B:");
            columnaB = sc.nextInt();

            // Inicializar matrices A y B
            int[][] A = new int[filaA][columnaA];
            int[][] B = new int[filaB][columnaB];

            // Validar dimensiones y solicitar valores si es necesario
            boolean validacion = true;

            switch (opcion) {
                case 1: // Sumar matrices
                case 2: // Restar matrices
                    if (filaA != filaB || columnaA != columnaB) {
                        System.out.println("¡Error!: Las matrices deben tener el mismo tamaño para esta operación.");
                        validacion = false;
                    }
                    break;

                case 3: // Multiplicar matrices
                    if (columnaA != filaB) {
                        System.out.println("¡Error!: No se puede multiplicar. El número de columnas de A debe ser igual al número de filas de B.");
                        validacion = false;
                    }
                    break;

                default:
                    System.out.println("¡Opción no válida!. Intente nuevamente.");
                    validacion = false;
            }

            // Si la validación es exitosa, solicitar los valores de las matrices
            if (validacion) {
                // Solicitar los valores de la matriz A
                System.out.println("Ingrese los valores de la matriz A:");
                for (int i = 0; i < filaA; i++) {
                    for (int j = 0; j < columnaA; j++) {
                        System.out.print("A[" + i + "][" + j + "]: ");
                        A[i][j] = sc.nextInt();
                    }
                }

                // Solicitar los valores de la matriz B
                System.out.println("Ingrese los valores de la matriz B:");
                for (int i = 0; i < filaB; i++) {
                    for (int j = 0; j < columnaB; j++) {
                        System.out.print("B[" + i + "][" + j + "]: ");
                        B[i][j] = sc.nextInt();
                    }
                }

                // Realizar la operación seleccionada
                switch (opcion) {
                    case 1: // Sumar matrices
                        int[][] S = new int[filaA][columnaA];
                        for (int i = 0; i < filaA; i++) {
                            for (int j = 0; j < columnaA; j++) {
                                S[i][j] = A[i][j] + B[i][j];
                            }
                        }
                        System.out.println("Resultado de la suma de matrices:");
                        imprimirMatriz(S);
                        break;

                    case 2: // Restar matrices
                        int[][] R = new int[filaA][columnaA];
                        for (int i = 0; i < filaA; i++) {
                            for (int j = 0; j < columnaA; j++) {
                                R[i][j] = A[i][j] - B[i][j];
                            }
                        }
                        System.out.println("Resultado de la resta de matrices:");
                        imprimirMatriz(R);
                        break;

                    case 3: // Multiplicar matrices
                        int[][] C = new int[filaA][columnaB];
                        for (int i = 0; i < filaA; i++) {
                            for (int j = 0; j < columnaB; j++) {
                                for (int k = 0; k < columnaA; k++) {
                                    C[i][j] += A[i][k] * B[k][j];
                                }
                            }
                        }
                        System.out.println("Resultado de la multiplicación de matrices:");
                        imprimirMatriz(C);
                        break;
                }
            }
        }

        // Cerrar el scanner al final
        sc.close();

        System.out.println();
        System.out.println("Gracias por usar nuestro operador de matrices...");
        System.out.println("¡Buen día!");
    }
}
