package co.edu.uniquindio.poo;
/**
 * 
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * 
 */
public class TestEmpleadoFreelance {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
    /**
     * 
     */

    @Test
    public void pruebaCalcularSalarioEmpleadoFreelance() {
        LOG.info("Iniciado test salario empleado Freelance");
        EmpleadoFreelance empleadoFreelance = new EmpleadoFreelance("Alejandro", "1115189302", 2, 50.000);
        double salario = empleadoFreelance.calcularSalario();
        assertEquals(100.000, salario);

        LOG.info("Finalizando test salario empleado Freelance");
    }
}