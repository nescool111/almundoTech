/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author nescool
 */
public class Usuario {

    
    private String nombreUsuario;

    public Usuario(String nombre) {
       this.setNombreUsuario(nombreUsuario);
    }
    
    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    private void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


}
