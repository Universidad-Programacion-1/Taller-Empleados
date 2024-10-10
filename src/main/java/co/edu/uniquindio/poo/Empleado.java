package co.edu.uniquindio.poo;

public abstract class Empleado {
    private String nombre, identificacionñ;

    public abstract double calcularSalario();

    public Empleado(String nombre, String identificacionñ) {
        this.nombre = nombre;
        this.identificacionñ = identificacionñ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacionñ() {
        return identificacionñ;
    }

    public void setIdentificacionñ(String identificacionñ) {
        this.identificacionñ = identificacionñ;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", identificacionñ=" + identificacionñ + "]";
    }
}
