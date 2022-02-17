/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tn.edu.esprit.models.evenement;
import tn.edu.esprit.utils.DataSource;



/**
 *
 * @author Fayechi
 */
public class ServiceEvenement implements IService<evenement> {

    Connection cnx = DataSource.getInstance().getCnx();

    @Override
   

    public void ajouter(evenement t) {
        try {
            String req = "INSERT INTO `evenement` (`nom`, `date_event`,`type_event`,`capacite`,`prix` ) VALUES (?,  str_to_date(?,'%d/%m/%y'), ? , ? , ? )";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, t.getNom());
            ps.setString(2, t.getDate_event());
            ps.setString(3, t.getType_event());
            ps.setInt(4, t.getCapacite());
            ps.setFloat(5, t.getPrix());

               
               
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public evenement getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<evenement> getAll() {
        List<evenement> list = new ArrayList<>();
        try {
            String req = "Select * from evenement";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                evenement p = new evenement(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getFloat(6) );
                list.add(p);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
    }

    @Override
    public boolean modifier(evenement t) {
        try {
            String req = "UPDATE  `evenement` SET nom= ? , date_event=str_to_date(?,'%d/%m/%y'), type_event= ? ,capacite= ? , prix = ?  WHERE id_event= ? ";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, t.getNom());
            ps.setString(2, t.getDate_event());
            ps.setString(3, t.getType_event());
            ps.setInt(4, t.getCapacite());
            ps.setFloat(5, t.getPrix());
             ps.setInt(6, t.getId_event());

               
               
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
    
            
                    

        }
        return true ; 
    }
    

    @Override
    public boolean supprimer(int id ) {
        
        
        
            try {
            String req = "DELETE FROM evenement  WHERE id_event= ?" ;
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1,id);
          

               
               
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
    
        }
        return true ; 
        
    }

}
