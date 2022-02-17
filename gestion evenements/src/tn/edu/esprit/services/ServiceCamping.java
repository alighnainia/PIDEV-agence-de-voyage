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
import tn.edu.esprit.models.camping;
import tn.edu.esprit.utils.DataSource;



/**
 *
 * @author Fayechi
 */
public class ServiceCamping implements IService<camping> {

    Connection cnx = DataSource.getInstance().getCnx();

    @Override
   

    public void ajouter(camping c) {
        try {
            String req = "INSERT INTO `camping` (`nom`, `date_camping`,`emplacement`,`type_camping` ) VALUES (?,  str_to_date(?,'%d/%m/%y'), ? , ?  )";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getDate_camping());
            ps.setString(3, c.getEmplacement());
            ps.setString(4, c.getType_camping());

               
               
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public camping getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<camping> getAll() {
        List<camping> list = new ArrayList<>();
        try {
            String req = "Select * from camping";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                camping p = new camping(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5) );
                list.add(p);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
    }

    @Override
    public boolean modifier(camping c) {
        try {
            String req = "UPDATE  `camping` SET nom= ? , date_camping=str_to_date(?,'%d/%m/%y'), emplacement= ? ,type_camping= ?   WHERE id_camping= ? ";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getDate_camping());
            ps.setString(3, c.getEmplacement());
            ps.setString(4, c.getType_camping());
            
             ps.setInt(5, c.getId_camping());

               
               
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
    
            
                    

        }
        return true ; 
    }
    

    @Override
    public boolean supprimer(int id ) {
        
        
        
            try {
            String req = "DELETE FROM camping  WHERE id_camping= ?" ;
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1,id);
          

               
               
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
    
        }
        return true ; 
        
    }

}
