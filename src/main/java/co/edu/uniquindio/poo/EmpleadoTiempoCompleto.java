package co.edu.uniquindio.poo;
import java.util.Scanner;

public class EmpleadoTiempoCompleto extends Empleado{

    private double salarioMensual;
    
    /**
     * Constructor de la clase de empleado tiempo completo
     * @param nombre
     * @param identificacionñ
     * @param salarioMensual
     */
    public EmpleadoTiempoCompleto(String nombre, String identificacionñ, double salarioMensual) {
        super(nombre, identificacionñ);
        this.salarioMensual = salarioMensual;
    }

    /** Metodo para calcular el salario del empleado de tiempo completo y retorna el salario del empleado
    * @return salarioMensual
    */
    @Override
    public double calcularSalario() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el salario del empleado de tiempo completo: ");
        double salarioMensual = teclado.nextDouble();
        System.out.println("El salario del empleado de tiempo completo es: "+ salarioMensual);
        return salarioMensual;
    }


    /**
     * Metodo get que sirve para odtener el salario mensual
     */
    public double getSalarioMensual() {
        return salarioMensual;
    }

    /**
     * Metodo set que sirve para modificar el salario mensual
     */
    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }


    /**
     * Metodo toString que sirve para imprimir las variables de la clase
     */
    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto ["+ super.toString() +"]";
    }
}
