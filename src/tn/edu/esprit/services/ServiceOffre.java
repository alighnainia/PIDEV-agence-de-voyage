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
import tn.edu.esprit.models.offre;
import tn.edu.esprit.utils.DataSource;


/**
 *
 * @author Fayechi
 */
public class ServiceOffre implements IService<offre> {

    Connection cnx = DataSource.getInstance().getCnx();

    @Override
    public void ajouter(offre t) {
        try {
            String req = "INSERT INTO `offre` (`destination`,date_debut,date_fin,prix) VALUES ('" +t.getDestination() + "', '" + t.getDate_debut() + "','" +t.getDate_fin() + "','" +t.getPrix() + "')";
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /*public void ajouter2(offre t) {
        try {
            String req = "INSERT INTO `offre` (`destination`, `date_debut`,`date_fin`,`prix`) VALUES (?, ?)";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, t.getDestination());
            ps.setString(2, t.getDate_debut());
            ps.setString(3, t.getDate_fin());
            ps.setFloat(4, t.getPrix());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }*/

    @Override
    public offre getById(int id_offre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<offre> getAll() {
        List<offre> list = new ArrayList<>();
        try {
            String req = "Select * from offre";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                offre p = new offre(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5));
                list.add(p);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
    }

    @Override
    public boolean modifier(offre t) {
            try {
            String req = "update  `offre` set destination=? ,date_debut=?,date_fin=?,prix=? where id_offre=?";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, t.getDestination());
            ps.setString(2, t.getDate_debut());
            ps.setString(3, t.getDate_fin());
            ps.setFloat(4, t.getPrix());
            ps.setInt(5, t.getId());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
            return true;
    }

  
    public boolean supprimer(int id_offre) {
             try {
            String req = "delete from offre where id_offre='" +id_offre + "'";
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
             return true;
    }

    @Override
    public boolean supprimer(offre t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}