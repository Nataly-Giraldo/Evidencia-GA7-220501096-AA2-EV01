
package co.edu.sena.pw_costuras_sas;

import co.edu.sena.pw_costuras_sas.IGU.Catalogo;
import co.edu.sena.pw_costuras_sas.IGU.Contactos;
import co.edu.sena.pw_costuras_sas.IGU.Nosotros;
import co.edu.sena.pw_costuras_sas.IGU.Principal;
import co.edu.sena.pw_costuras_sas.IGU.Servicios;

public class PW_Costuras_SAS {

    public static void main(String[] args) {
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
        Nosotros misi = new Nosotros();
        misi.setVisible(true);
        misi.setLocationRelativeTo(null);
     
        Servicios serve =new Servicios();
        serve.setVisible(true);
        serve.setLocationRelativeTo(null);
        
        Catalogo cata = new Catalogo();
        cata.setVisible(true);
        cata.setLocationRelativeTo(null);
        
        Contactos medios_comu = new Contactos();
        medios_comu.setVisible(true);
        medios_comu.setLocationRelativeTo(null);
    }
}