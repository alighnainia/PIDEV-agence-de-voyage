/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.models;

/**
 *
 * @author Fayechi
 */
public class reservation {
    private int id_reservation;
    private int id_user;
    private int id_offre;
    private String date;

    public reservation(int id_user, int id_offre, String date) {
        this.id_user = id_user;
        this.id_offre = id_offre;
        this.date = date;
    }

    public reservation(int id_reservation, int id_user, int id_offre, String date) {
        this.id_reservation = id_reservation;
        this.id_user = id_user;
        this.id_offre = id_offre;
        this.date = date;
    }

    public int getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_offre() {
        return id_offre;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "reservation{" + "id_reservation=" + id_reservation + ", id_user=" + id_user + ", id_offre=" + id_offre + ", date=" + date + '}';
    }
    
    
    
}
