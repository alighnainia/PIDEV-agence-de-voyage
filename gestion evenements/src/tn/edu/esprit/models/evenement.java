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
public class evenement {
    private int id_event;
    private String nom;
    private String  date_event;
    private String type_event;
       private int capacite;
         private float prix;

    public evenement(String nom, String date_event, String type_event, int capacite, float prix) {
        this.nom = nom;
        this.date_event = date_event;
        this.type_event = type_event;
        this.capacite = capacite;
        this.prix = prix;
    }

    public evenement(int id_event, String nom, String date_event, String type_event, int capacite, float prix) {
        this.id_event = id_event;
        this.nom = nom;
        this.date_event = date_event;
        this.type_event = type_event;
        this.capacite = capacite;
        this.prix = prix;
    }

    public int getId_event() {
        return id_event;
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate_event() {
        return date_event;
    }

    public void setDate_event(String date_event) {
        this.date_event = date_event;
    }

    public String getType_event() {
        return type_event;
    }

    public void setType_event(String type_event) {
        this.type_event = type_event;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "evenement{" + "id_event=" + id_event + ", nom=" + nom + ", date_event=" + date_event + ", type_event=" + type_event + ", capacite=" + capacite + ", prix=" + prix + '}';
    }


    

   
    
    
}
