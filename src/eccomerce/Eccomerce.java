/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eccomerce;

import com.eccomerce.enums;
import com.jpa.eccomerce.Customer;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author PC
 */
public class Eccomerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      EntityManagerFactory ef=Persistence.createEntityManagerFactory("EccomercePU")
       ;EntityManager en = ef.createEntityManager();
        
       en.getTransaction().begin();
        Customer cliente = new Customer();
       cliente.setA_paterno("Gutierritos");
      cliente.setA_materno("Jefersson");
      cliente.setNombre("Alvin");
     cliente.setBirthday(Calendar.getInstance().getTime());
     cliente.setStatus(enums.INACTIVO);
        
      Customer cliente2 = new Customer();
       cliente2.setA_paterno("Joaquin");
      cliente2.setA_materno("Vargas");
      cliente2.setNombre("Guillermo"); 
      cliente2.setBirthday(Calendar.getInstance().getTime());
      cliente2.setStatus(enums.ACTIVO);
      
      en.persist(cliente);
      en.persist(cliente2);
      en.getTransaction().commit();
      
    }
    
}
