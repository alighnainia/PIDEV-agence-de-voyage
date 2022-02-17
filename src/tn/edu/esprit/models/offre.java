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
public class offre {
    private int id_offre;
    private String destination;
    private String date_debut;
    private String date_fin;
    private float prix;

    public offre(String destination, String date_debut, String date_fin, float prix) {
        this.destination = destination;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.prix = prix;
    }
    
    

    public offre(int id, String destination, String date_debut, String date_fin, float prix) {
        this.id_offre = id;
        this.destination = destination;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.prix = prix;
    }

    public int getId() {
        return id_offre;
    }

    public void setId(int id) {
        this.id_offre = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "offre{" + "id=" + id_offre + ", destination=" + destination + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", prix=" + prix + '}';
    }

    
}

    