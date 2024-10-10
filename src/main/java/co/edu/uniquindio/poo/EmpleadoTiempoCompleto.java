package co.edu.uniquindio.poo;
import java.util.Scanner;

public class EmpleadoTiempoCompleto extends Empleado{

    private double salarioMensual;
        
    public EmpleadoTiempoCompleto(String nombre, String identificacionñ, double salarioMensual) {
        super(nombre, identificacionñ);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el salario del empleado de tiempo completo: ");
        double salarioMensual = teclado.nextDouble();
        System.out.println("El salario del empleado de tiempo completo es: "+ salarioMensual);
        return salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto ["+ super.toString() +"]";
    }
}
