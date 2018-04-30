package entidades;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author nescool
 */
public class EmpleadoTest {
    Empleado empleado= new Empleado("test", RolEmpleado.SUPERVISOR);

    /**
     * Prueba que valida que exista una clase empleados
     */
    @Test
    public void usuarioExisteTest() {
        Assert.assertNotNull(empleado.getNombreEmpleado());
    }


}
