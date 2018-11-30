package pdsw.project.entities;

import java.util.ArrayList;

/**
 * Class Role that defines all the
 * User Types that an User can be
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public enum Role {
    
    ADMINISTRADOR, PERSONAL_PMO_ODI, PROPONENTE, USUARIO_CONSULTA;
    
    public static ArrayList<String> getRoles() {
        ArrayList<String> roles = new ArrayList<String>();    
        for (Role r : Role.values()) {

            roles.add(r.toString());
        }
        return roles;
    }

    public static Role getADMINISTRADOR() {
        return ADMINISTRADOR;
    }

    public static Role getPERSONAL_PMO_ODI() {
        return PERSONAL_PMO_ODI;
    }

    public static Role getPROPONENTE() {
        return PROPONENTE;
    }

    public static Role getUSUARIO_CONSULTA() {
        return USUARIO_CONSULTA;
    }
    
    @Override
    public String toString() {
        return "Rol{" + '}';
    }
}