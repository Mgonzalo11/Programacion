package dominio;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre; // Atributo para almacenar el nombre de la provincia
    private List<Municipio> municipios; // Lista que almacena los municipios que pertenecen a la provincia

    // Constructor que inicializa el nombre de la provincia y la lista de municipios
    public Provincia(String nombre) {
        this.nombre = nombre;
        this.municipios = new ArrayList<>(); // Inicializa la lista de municipios vacía
    }

    // Método getter para obtener el nombre de la provincia
    public String getNombre() {
        return nombre;
    }

    // Método para añadir un municipio a la provincia
    public void addMunicipio(Municipio municipio) {
        municipios.add(municipio); // Añade el municipio a la lista
    }

    // Método para contar el número total de habitantes de la provincia
    public int contarHabitantes() {
        int totalHabitantes = 0; // Variable que acumula el número total de habitantes
        for (Municipio municipio : municipios) {
            totalHabitantes += municipio.contarHabitantes(); // Suma los habitantes de cada municipio
        }
        return totalHabitantes; // Devuelve el total
    }

    // Método getter para obtener la lista de municipios
    public List<Municipio> getMunicipios() {
        return municipios;
    }

    // Método toString para representar la provincia como una cadena
    @Override
    public String toString() {
        return "Provincia: " + nombre + ", Municipios: " + municipios;
    }
}
