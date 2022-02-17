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
import tn.edu.esprit.models.reservation;
import tn.edu.esprit.utils.DataSource;


/**
 *
 * @author Fayechi
 */
public class ServiceReservation implements IService<offre> {

    Connection cnx = DataSource.getInstance().getCnx();

    public void ajouter(reservation t) {
        try {
            String req = "INSERT INTO `reservation` (`id_user`,id_offre,date) VALUES ('" +t.getId_user() + "', '" + t.getId_offre() + "','" +t.getDate()  + "')";
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
    public offre getById(int id_reservation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<reservation> getAll() {
        List<reservation> list = new ArrayList<>();
        try {
            String req = "Select * from reservation";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                reservation p = new reservation(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4));
                list.add(p);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
    }

    @Override
    public boolean modifier(reservation t) {
            try {
            String req = "update  `reservation` set id_user=? ,id_offre=?,date=? where id_reservation=?";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, t.getId_user());
            ps.setInt(2, t.getId_offre());
            ps.setString(3, t.getDate());
            
            ps.setInt(4, t.getId_reservation());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
            return true;
    }

  
    public boolean supprimer(int id_reservation) {
             try {
            String req = "delete from reservation where id_reservation='" +id_reservation + "'";
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
             return true;
    }

    @Override
    public void ajouter(offre t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modifier(offre t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean supprimer(offre t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   