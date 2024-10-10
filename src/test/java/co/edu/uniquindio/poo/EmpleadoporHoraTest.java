package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class EmpleadoporHoraTest {
        private static final Logger LOG = Logger.getLogger(AppTest.class.getName());



@Test
public void testcalcularSalarioPorhoras(){
LOG.info("Iniciando test para calcular el salario por horas del empleado" );
    EmpleadoPorHora empleado= new EmpleadoPorHora("juan", "1012", 7, 100);
    double salario= empleado.calcularSalarioPorhoras();
    System.out.println("prueba"+salario);
    assertEquals(700, salario);
    LOG.info("fin test");


}



}
