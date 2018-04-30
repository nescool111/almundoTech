package utilidades;/*
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
public class UtilTest {

            Util util= new Util();
            /**
     * Prueba que valida que sirve el metodo crear nombre usuarios o empleados
     */
    @Test
    public void usuarioExisteTest() {
   
        Assert.assertNotNull(util.generarNombreAleatorio());
     }
    
}
