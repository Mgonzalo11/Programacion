package dominio;

public class Localidad {
    private String nombre; // Atributo para almacenar el nombre de la localidad
    private int numeroDeHabitantes; // Atributo para almacenar el número de habitantes de la localidad

    // Constructor que inicializa los atributos de la localidad
    public Localidad(String nombre, int numeroDeHabitantes) {
        this.nombre = nombre;
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    // Método getter para obtener el nombre de la localidad
    public String getNombre() {
        return nombre;
    }

    // Método setter para establecer el nombre de la localidad
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener el número de habitantes de la localidad
    public int getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }

    // Método setter para establecer el número de habitantes de la localidad
    public void setNumeroDeHabitantes(int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    // Método toString para representar la localidad como una cadena
    @Override
    public String toString() {
        return "Localidad: " + nombre + ", Habitantes: " + numeroDeHabitantes;
    }
}
