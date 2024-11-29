import java.util.ArrayList;
import java.util.HashSet;

class Person {
    String firstName;  // Nombre de la persona
    String lastName;   // Apellido de la persona
    String country;    // País de origen
    String continent;  // Continente de origen
    int age;           // Edad de la persona
    String language;   // Lenguaje que domina
    String greeting;   // Saludo personalizado

    // Constructor de la clase Person para inicializar sus atributos
    public Person(String firstName, String lastName, String country, String continent, int age, String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.continent = continent;
        this.age = age;
        this.language = language;
        this.greeting = ""; // Saludo inicial vacío
    }
}

public class Continentes {

    // Método para verificar si hay al menos una persona de cada continente
    public static boolean isMeetup(ArrayList<Person> person) {
        boolean africa = false, americas = false, asia = false, europe = false, oceania = false;

        // Recorremos la lista de personas y actualizamos los valores según el continente
        for (Person p : person) {
            switch (p.continent) {
                case "Africa":
                    africa = true;
                    break;
                case "Americas":
                    americas = true;
                    break;
                case "Asia":
                    asia = true;
                    break;
                case "Europe":
                    europe = true;
                    break;
                case "Oceania":
                    oceania = true;
                    break;
            }
        }

        // Retornamos true si todos los continentes están representados
        return africa && americas && asia && oceania && europe;
    }

    // Método para contar cuántos desarrolladores de JavaScript son de Europa
    public static int javascriptDevelopers(ArrayList<Person> person) {
        int javasriptContador = 0;

        // Recorremos la lista de personas y contamos si cumplen ambas condiciones
        for (Person javaPerson : person) {
            if (javaPerson.language.equals("JavaScript") && javaPerson.continent.equals("Europe")) {
                javasriptContador++;
            }
        }

        return javasriptContador;
    }

    // Método para obtener un conjunto de lenguajes representados
    public static HashSet<String> languajeRepresented(ArrayList<Person> person) {
        HashSet<String> languaje = new HashSet<>();

        // Recorremos la lista de personas y añadimos los lenguajes al conjunto
        for (Person personLanguaje : person) {
            languaje.add(personLanguaje.language);
        }

        return languaje;
    }

    // Método para agregar un saludo personalizado al atributo `greeting` de cada persona
    public static ArrayList<Person> addGreeting(ArrayList<Person> person) {
        for (Person person2 : person) {
            person2.greeting = "Hi " + person2.firstName + ", what do you like the most about " + person2.language + "?";
        }

        return person;
    }

    public static void main(String[] args) {

        // Creamos una lista de personas con datos iniciales
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("Fatima", "A.", "Algeria", "Africa", 25, "JavaScript"));
        person.add(new Person("Agustín", "M.", "Chile", "Americas", 37, "C"));
        person.add(new Person("Jing", "X.", "China", "Asia", 39, "Ruby"));
        person.add(new Person("Laia", "P.", "Andorra", "Europe", 55, "Ruby"));
        person.add(new Person("Oliver", "Q.", "Australia", "Oceania", 65, "PHP"));

        // Verificamos si hay un representante en cada continente
        System.out.println("¿Existe un representante en cada continente? " + isMeetup(person));
        System.out.println();

        // Contamos los desarrolladores de JavaScript de Europa
        System.out.println("¿Cuántos JavaScript developers de Europa existen? " + javascriptDevelopers(person));
        System.out.println();

        // Agregamos un saludo personalizado para cada persona
        addGreeting(person);

        // Imprimimos los saludos personalizados
        for (Person p : person) {
            System.out.println(p.greeting);
        }
        System.out.println();

        // Mostramos la lista de lenguajes representados
        System.out.println("Lista de lenguajes: " + languajeRepresented(person));
    }
}
