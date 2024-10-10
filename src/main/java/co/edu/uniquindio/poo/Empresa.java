package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private Collection<EmpleadoFreelance> empleadoFreelances;
    private Collection<EmpleadoPorHora> empleadoPorHoras;
    private Collection<EmpleadoTiempoCompleto> empleadoTiempoCompletos;
    public Empresa(String nombre) {
        this.nombre = nombre;
        empleadoFreelances = new LinkedList<>();
        empleadoPorHoras = new LinkedList<>();
        empleadoTiempoCompletos = new LinkedList<>();

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Collection<EmpleadoFreelance> getEmpleadoFreelances() {
        return empleadoFreelances;
    }
    public void setEmpleadoFreelances(Collection<EmpleadoFreelance> empleadoFreelances) {
        this.empleadoFreelances = empleadoFreelances;
    }
    public Collection<EmpleadoPorHora> getEmpleadoPorHoras() {
        return empleadoPorHoras;
    }
    public void setEmpleadoPorHoras(Collection<EmpleadoPorHora> empleadoPorHoras) {
        this.empleadoPorHoras = empleadoPorHoras;
    }
    public Collection<EmpleadoTiempoCompleto> getEmpleadoTiempoCompletos() {
        return empleadoTiempoCompletos;
    }
    public void setEmpleadoTiempoCompletos(Collection<EmpleadoTiempoCompleto> empleadoTiempoCompletos) {
        this.empleadoTiempoCompletos = empleadoTiempoCompletos;
    }
    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", empleadoFreelances=" + empleadoFreelances + ", empleadoPorHoras="
                + empleadoPorHoras + ", empleadoTiempoCompletos=" + empleadoTiempoCompletos + "]";
    }
    

    
    

    
}
