package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;

    /**
     * Constructor vacío que permite crear un familiar sin inicializar sus atributos.
     */
    public Familiar() { }

    /**
     * Constructor que inicializa los atributos del familiar con valores dados.
     * @param cedula Número de identificación de la persona.
     * @param nombre Nombre de la persona.
     * @param apellido Apellido de la persona.
     * @param direccion Dirección de residencia de la persona.
     * @param parentesco Relación de parentesco con la persona principal.
     * @param tipoDeSangre Tipo de sangre del familiar.
     * @param fechaDeNacimiento Fecha de nacimiento del familiar.
     */
    public Familiar(String cedula, String nombre, String apellido, String direccion,
                    String parentesco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento) {
        setDireccion(direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * Obtiene el parentesco del familiar.
     * @return Tipo de parentesco.
     */
    public String getParentesco() {
        return parentesco;
    }

    /**
     * Establece el parentesco del familiar.
     * @param parentesco Tipo de parentesco.
     */
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    /**
     * Obtiene el tipo de sangre del familiar.
     * @return Tipo de sangre.
     */
    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    /**
     * Establece el tipo de sangre del familiar.
     * @param tipoDeSangre Tipo de sangre.
     */
    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    /**
     * Obtiene la fecha de nacimiento del familiar.
     * @return Fecha de nacimiento.
     */
    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del familiar.
     * @param fechaDeNacimiento Fecha de nacimiento.
     */
    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * Calcula la edad del familiar a partir de su fecha de nacimiento.
     * @return Edad en años. Si la fecha de nacimiento no está definida, devuelve -1.
     */
    public double calcularEdad() {
        if (fechaDeNacimiento == null) {
            return -1;
        }

        Calendar hoy = Calendar.getInstance();
        int anioActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH);
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);

        int anioNacimiento = fechaDeNacimiento.get(Calendar.YEAR);
        int mesNacimiento = fechaDeNacimiento.get(Calendar.MONTH);
        int diaNacimiento = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);

        int edad = anioActual - anioNacimiento;

        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        return edad;
    }

    /**
     * Devuelve una representación en cadena del familiar con sus atributos.
     * @return Cadena con los datos del familiar.
     */
    @Override
    public String toString() {
        return super.toString() +
                ",\n Parentesco: " + parentesco +
                ",\n Tipo de Sangre: " + tipoDeSangre +
                ",\n Edad: " + calcularEdad() + " años";
    }

