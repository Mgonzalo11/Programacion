EJERCICIO 8

public class Habitante {
    String nombre;
    String apellido1;
    String apellido2;

    // Metodo para establecer los valores
    public void setDatos(String nombreHabitante, String apellido1Habitante, String apellido2Habitante) {
        nombre = nombreHabitante;
        apellido1 = apellido1Habitante;
        apellido2 = apellido2Habitante;
    }

    // Metodo main donde se ejecuta el programa
    public static void main(String[] args) {
        // Crear una instancia de Habitante
        Habitante habitante1 = new Habitante();
        habitante1.setDatos("Miguel", "Gonzalo", "Vázquez");

        // Imprimir el nombre completo
        System.out.println("Nombre completo: " + habitante1.nombre + " " + habitante1.apellido1 + " " + habitante1.apellido2);
    }
}


EJERCICIO 9
Se usa private para los miembros que no deben ser accesibles desde otras clases (por ejemplo, los atributos de la clase Habitante).
Se usa public para los métodos que deberían ser accesibles desde fuera de la clase (como los métodos setDatos y el método main).

public class Habitante2 {
    // Atributos privados (no accesibles desde fuera de esta clase directamente)
    private String nombre;
    private String apellido1;
    private String apellido2;
    // Metodo publico para establecer los valores (accesible desde fuera)
    public void setDatos(String nombreHabitante2, String apellido1Habitante2, String apellido2Habitante2) {
        nombre = nombreHabitante2;
        apellido1 = apellido1Habitante2;
        apellido2 = apellido2Habitante2;
    }
    // Metodo publico para obtener el nombre completo
    public String getNombreCompleto() {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    public static void main(String[] args) {
        // Crear una instancia de Habitante2
        Habitante2 habitante2 = new Habitante2();
        // Utilizamos el metodo publico SetDatos para dar valores a la variable
        habitante2.setDatos("Miguel", "Gonzalo", "Vázquez");
        // Imprimir el nombre completo
        System.out.println("Nombre completo: " + habitante2.getNombreCompleto());
    }
}

EJERCICIO 10
En Java, this se utiliza para referirse a la instancia actual de la clase, diferenciando entre atributos de la clase y parámetros de método, llamando a otros constructores dentro de la misma clase, pasando la instancia actual a métodos o constructores y permitiendo el encadenamiento de métodos.

public class Habitante3 {
    private String nombre;
    private String apellido1;
    private String apellido2;

    public void setDatos(String nombreHabitante3, String apellido1Habitante3, String apellido2Habitante3) {
        this.nombre = nombreHabitante3;
        this.apellido1 = apellido1Habitante3;
        this.apellido2 = apellido2Habitante3;
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido1 + " " + this.apellido2;
    }

    public static void main(String[] args) {
        Habitante3 habitante3 = new Habitante3();
        habitante3.setDatos("Miguel", "Gonzalo", "Vázquez");
        System.out.println("Nombre completo: " + habitante3.getNombreCompleto());
    }
}

EJERCICIO 11.1
En Java, los métodos getter y setter son utilizados para controlar el acceso a los atributos privados de una clase. 

public class Habitante4 {

    private String nombre;
    private String apellido1;
    private String apellido2;

    // Constructor para inicializar los atributos
    public Habitante4(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    // Metodo getter único para obtener todos los atributos como una cadena
    public String getDatos() {
        return "Nombre: " + nombre + ", Primer Apellido: " + apellido1 + ", Segundo Apellido: " + apellido2;
    }

    public static void main(String[] args) {
        // Crear una instancia de Habitante
        Habitante4 habitante4 = new Habitante4("Miguel", "Gonzalo", "Vázquez");
        // Imprimir los valores usando el metodo getter
        System.out.println(habitante4.getDatos());
    }
}

EJERCICIO 11.2
public class Habitante4 {

    private String nombre;
    private String apellido1;
    private String apellido2;

    // Constructor para inicializar los atributos
    public Habitante4(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public String getDatos() {
        return "Nombre: " + nombre + ", Primer Apellido: " + apellido1 + ", Segundo Apellido: " + apellido2;
    }

    public void setDatos(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public static void main(String[] args) {
        // Crear una instancia de Habitante4
        Habitante4 habitante4 = new Habitante4("Miguel", "Gonzalo", "Vázquez");
        // Imprimir los valores
        System.out.println(habitante4.getDatos());
        realizarComprobacion();
    }
    public static void realizarComprobacion(){
        Habitante4 habitante4 = new Habitante4("Miguel", "Gonzalo", "Vázquez");
        System.out.println(habitante4.getDatos());
    }
}

EJERCICIO 11.3
public class Comprobacion {

    // Método estático para realizar comprobación
    public static void realizarComprobacion() {
        // Crear una instancia de Habitante4
        Habitante4 habitante4 = new Habitante4("Miguel", "Gonzalo", "Vázquez");
        System.out.println(habitante4.getDatos());
}

EJERCICIO 11.4
Un método estático en Java pertenece a la clase en lugar de a una instancia específica, permitiendo que se llame sin crear un objeto de la clase. Se utilizan para operaciones comunes o utilitarias que no dependen del estado de un objeto particular, y se accede a ellos directamente mediante el nombre de la clase.

EJERCICIO 12

public class Habitante {
    // Declaramos las variables del habitante
    private String nombre, apellido1, apellido2;

    // Constructor con parámetros para inicializar los atributos
    public Habitante(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    // Metodo que devuelve el nombre completo del habitante
    public String getNombreCompleto() {
        return nombre + " " + apellido1 + " " + apellido2; // Concatenación los datos del habitante
    }

    public static class Comprobacion {
        // Metodo que realiza la comprobacion
        public static void realizarComprobacion() {
            // Crea un nuevo objeto Habitante con los valores dados
            Habitante habitante1 = new Habitante("Miguel", "Gonzalo", "Vázquez");
            // Imprime el nombre completo del habitante
            System.out.println("El nombre es: " + habitante1.getNombreCompleto());
        }
    }
    // Inicializamos el programa
    public static void main(String[] args) {
        Comprobacion.realizarComprobacion();
    }
}