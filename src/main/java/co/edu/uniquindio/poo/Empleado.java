package co.edu.uniquindio.poo;
/**
 * 
 */
public abstract class Empleado {
    private String nombre, identificacion;
    /**
     * 
     * @return
     */

    public abstract double calcularSalario();
    /**
     * 
     * @param nombre
     * @param identificacion
     */

    public Empleado(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }
    /**
     * 
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    /**
     * 
     */

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", identificacion=" + identificacion + "]";
    }
}
