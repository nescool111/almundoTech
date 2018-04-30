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
public class Empleado {
    

    private String nombreEmpleado;
    private RolEmpleado rolEmpleado;

    Empleado(String nombreEmpleado, RolEmpleado rolEmpleado) {
        setNombreEmpleado(nombreEmpleado);
        setRolEmpleado(rolEmpleado);
    }

    
    /**
     * @return the nombreEmpleado
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * @param nombreEmpleado the nombreEmpleado to set
     */
    private void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
 
    
    /**
     * @return the rolEmpleado
     */
    public RolEmpleado getRolEmpleado() {
        return rolEmpleado;
    }

    /**
     * @param rolEmpleado the rolEmpleado to set
     */
    private void setRolEmpleado(RolEmpleado rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }


    
}
