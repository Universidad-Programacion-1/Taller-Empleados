package co.edu.uniquindio.poo;

import java.util.Scanner;
public class EmpleadoPorHora extends Empleado {
    private  double valorHora;
    private int horasTrabajadas;
    
    public EmpleadoPorHora (String nombre, String identificacionñ,int horasTrabajadas , double valorHora) {
        super(nombre,identificacionñ);
        this.horasTrabajadas=horasTrabajadas;
        this.valorHora=valorHora;
    }
    
    @Override
    public double calcularSalario() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio de la hora");
        double horasTrabajadas=teclado.nextInt();
        System.out.println("Ingrese las horas trabajadas por el empleado:");
        return horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    
    @Override
    public String getIdentificacionñ() {

        return super.getIdentificacionñ();
    }

    @Override
    public String getNombre() {

        return super.getNombre();
    }

    @Override
    public void setIdentificacionñ(String identificacionñ) {

        super.setIdentificacionñ(identificacionñ);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
public  double calcularSalarioPorhoras() {
    double salario=0;
    {
    salario =this.horasTrabajadas*this.valorHora; }
    return salario;
    }

@Override
public String toString() {
    return "EmpleadoPorHora [valorHora=" + valorHora + ", horasTrabajadas=" + horasTrabajadas + ", getValorHora()="
            + getValorHora() + ", getHorasTrabajadas()=" + getHorasTrabajadas() + ", getIdentificacionñ()="
            + getIdentificacionñ() + ", getNombre()=" + getNombre() + "]";
}



    
}