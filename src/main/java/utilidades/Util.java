/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import org.apache.commons.lang.RandomStringUtils;

import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * W
 *
 * @author nescool
 */
public class Util {

    public Util() {

    }

    /**
     * Metodo que crea un nombre aleatorio a los usuarios o empleados
     */
    public String generarNombreAleatorio() {
        String generatedString = RandomStringUtils.randomAlphabetic(10);
          LOGGER.log(Level.INFO, "nombreAleatorio: "+ generatedString);
        return generatedString;

    }

}
