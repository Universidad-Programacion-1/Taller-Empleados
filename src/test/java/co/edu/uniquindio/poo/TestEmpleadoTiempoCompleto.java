package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class TestEmpleadoTiempoCompleto {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
    /**
     * Test AssertEquals
     * Este test valida que el salario resivido sea igual al esperado
     */
    @Test
    public void testAssertEquals() {
        LOG.info("Inicio test Salario del empleado de tiempo completo");

        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("Carlos", "123456", 2000000);
        double salario = empleado.calcularSalario();
        System.out.println("Prueba"+salario);
        assertEquals(2000000, salario);
        LOG.info("Fin test assertEquals");
    }
}
