/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.models;

/**
 *
 * @author Admin
 */
public class camping {
      
    private int id_camping;
    private String nom;
    private String date_camping; 
    private String emplacement;   
    private String type_camping;

    public camping(String nom, String date_camping, String emplacement, String type_camping) {
        this.nom = nom;
        this.date_camping = date_camping;
        this.emplacement = emplacement;
        this.type_camping = type_camping;
    }

    public camping(int id_camping, String nom, String date_camping, String emplacement, String type_camping) {
        this.id_camping = id_camping;
        this.nom = nom;
        this.date_camping = date_camping;
        this.emplacement = emplacement;
        this.type_camping = type_camping;
    }

    public int getId_camping() {
        return id_camping;
    }

    public void setId_camping(int id_camping) {
        this.id_camping = id_camping;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate_camping() {
        return date_camping;
    }

    public void setDate_camping(String date_camping) {
        this.date_camping = date_camping;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getType_camping() {
        return type_camping;
    }

    public void setType_camping(String type_camping) {
        this.type_camping = type_camping;
    }

    @Override
    public String toString() {
        return "camping{" + "id_camping=" + id_camping + ", nom=" + nom + ", date_camping=" + date_camping + ", emplacement=" + emplacement + ", type_camping=" + type_camping + '}';
    }
    
    
      
    
    












    
}
