package co.edu.uniquindio.poo;
/**
 * Se está creando la clase Empleado Freelance que hace parte de la empresa
 */
public class EmpleadoFreelance extends Empleado {
    public int proyectoCompletado;
    public double pagoPorProyecto;
    /**
     * Se genera un método constructor para poder crear esos objetos
     * @param nombre
     * @param identificacion
     * @param proyectoCompletado
     * @param pagoPorProyecto
     */

    public EmpleadoFreelance(String nombre, String identificacion, int proyectoCompletado, double pagoPorProyecto) {
        super(nombre, identificacion);
        this.proyectoCompletado = proyectoCompletado;
        this.pagoPorProyecto = pagoPorProyecto;
    }
    /**
     * se utilizan los get y set en los objetos para poder llamarlos a otras clases
     * @return
     */

    public int getProyectoCompletado() {
        return proyectoCompletado;
    }


    public void setProyectoCompletado(int proyectoCompletado) {
        this.proyectoCompletado = proyectoCompletado;
    }


    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }


    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }
   
    /**
     * se utiliza un toString para mostrar los objetos
     */
    @Override
    public String toString() {
        return "EmpleadoFreelance [proyectoCompletado=" + proyectoCompletado + ", pagoPorProyecto=" + pagoPorProyecto
                + "]";
    }
    /**
     * Este método sirve para calcular el salario de empleado Freelance por medio de una multiplicación de los proyectos que este haya completado.
     */
    @Override
    public double calcularSalario() {
        double salarioFreelance = 0;

        if(proyectoCompletado!=0){
            salarioFreelance=pagoPorProyecto*proyectoCompletado;
            System.out.println("El salario del Freelance es igual a "+ salarioFreelance);
        }
        if(proyectoCompletado==0){
            System.out.println("no a realizado ningún proyecto completo");
        }
        return salarioFreelance;

        
    }

}
