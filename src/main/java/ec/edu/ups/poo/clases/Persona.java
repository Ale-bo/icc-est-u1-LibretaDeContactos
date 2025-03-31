package ec.edu.ups.poo.clases;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;

    /**
     * Constructor que inicializa los atributos de la persona con valores dados.
     * @param cedula Número de identificación de la persona.
     * @param nombre Nombre de la persona.
     * @param apellido Apellido de la persona.
     * @param direccion Dirección de residencia de la persona.
     */
    public Persona(String cedula, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    /**
     * Constructor vacío que permite crear una persona sin inicializar sus atributos.
     */
    public Persona() {
    }

    /**
     * Establece el número de cédula de la persona.
     * @param cedula Número de identificación.
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Establece el nombre de la persona.
     * @param nombre Nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el apellido de la persona.
     * @param apellido Apellido de la persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Establece la dirección de la persona.
     * @param direccion Dirección de residencia.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número de cédula de la persona.
     * @return Número de identificación.
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Obtiene el nombre de la persona.
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     * @return Apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtiene la dirección de la persona.
     * @return Dirección de residencia.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Devuelve una representación en cadena de la persona con sus atributos.
     * @return Cadena con los datos de la persona.
     */

    @Override
    public String toString() {
        return "\n Cedula: " + cedula +
                ",\n Nombre: " + nombre +
                ",\n Apellido: " + apellido +
                ",\n Direccion: " + direccion;
    }
}
