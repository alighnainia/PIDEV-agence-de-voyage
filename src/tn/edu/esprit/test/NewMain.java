/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.test;

import tn.edu.esprit.models.offre;
import tn.edu.esprit.models.reservation;
import tn.edu.esprit.services.ServiceOffre;
import tn.edu.esprit.services.ServiceReservation;

/**
 *
 * @author Fayechi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        


//ServiceOffre sp = new ServiceOffre();
        //offre p = new offre("brazil", "15 fevrier 2022", "23 fevrier 2022",800);
         //sp.ajouter(p);
             //offre p = new offre(3,"malta", "20 mars 2022", "30 mars 2022", 500);
           
              // sp.modifier(p);
            
        //sp.supprimer(2);
       // System.out.println(sp.getAll());

        
    
    
        ServiceReservation sp = new ServiceReservation() ;
        //reservation p = new reservation( 2, 2,"14 mars");
         //sp.ajouter(p);
            // reservation p = new reservation(1,1, 14, "25 mars 2022");
           
              //sp.modifier(p);
            
       // sp.supprimer(3);
        System.out.println(sp.getAll());
        
    }
}
    
