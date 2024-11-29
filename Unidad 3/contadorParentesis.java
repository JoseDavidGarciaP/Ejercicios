public class contadorParentesis {

    // Método para verificar si el orden de los paréntesis en una cadena es válido
    public static boolean isOrderValid(String parenthesis) {

        // Variable para llevar el conteo de los paréntesis
        int contadorParenthesis = 0;

        // Recorremos la cadena de caracteres
        for (char parent : parenthesis.toCharArray()) {
            if (parent == '(') {
                contadorParenthesis++; // Incrementamos si encontramos un paréntesis de apertura
            } else if (parent == ')') {
                contadorParenthesis--; // Decrementamos si encontramos un paréntesis de cierre
            }

            // Si en algún momento el contador es negativo, el orden no es válido
            if (contadorParenthesis < 0) {
                return false;
            }
        }

        // El orden es válido si al final el contador es exactamente 0
        return contadorParenthesis == 0;
    }

    public static void main(String[] args) {

        // Ejemplos de prueba para verificar la validez del orden de paréntesis
        System.out.println("Orden válido '()': " + isOrderValid("()"));  
        System.out.println("Orden válido ')(()))': " + isOrderValid(")(()))"));  
        System.out.println("Orden válido ')(': " + isOrderValid(")("));  
        System.out.println("Orden válido '(())((()())())': " + isOrderValid("(())((()())())"));   
    }   
}
