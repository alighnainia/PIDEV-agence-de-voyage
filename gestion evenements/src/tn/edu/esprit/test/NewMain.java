/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.edu.esprit.test;

import tn.edu.esprit.models.evenement;
import tn.edu.esprit.models.camping;

import tn.edu.esprit.services.ServiceEvenement;
import tn.edu.esprit.services.ServiceCamping;


import tn.edu.esprit.utils.DataSource;




/**
 *
 * @author Fayechi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceEvenement sp = new ServiceEvenement();    
        ServiceCamping sc  = new ServiceCamping();
        
    //  evenement p = new evenement("chedget", "17/12/20", "valentin", 154, 100 );
        
      //   sp.ajouter(p); 
            //   System.out.println(" ***** Ajouter ************");
 
  
       // evenement p = new evenement( 6,"okaa", "17/12/21", "kakaka", 150, 250 );
        
       // sp.modifier(p); 
        //   System.out.println(" ***** modification ************");

               //sp.supprimer(6); 
                
               //    System.out.println(" ***** supprimé aves success  ************");


               
               
               
               
               
               
               
       
                //    System.out.println(" ***** TABLE CAMPING  ************");
      //  camping c = new camping("campingdaymond", "17/12/20", "nabuel", "traduitonale" );       
        // sc.ajouter(c);       
         //   System.out.println(" ***** Ajouter ************");        
        
         
       // camping c = new camping(1, "campingAASSAASA", "17/12/09", "paris", "traduitonale" );
         //  sc.modifier(c);     
         //   System.out.println(" ***** modification ************");
         
         
          // sc.supprimer(1);            
                 //  System.out.println(" ***** supprimé aves success  ************");
         
         
        System.out.println(sp.getAll());
        
        
       
        
        
    }
    
}
