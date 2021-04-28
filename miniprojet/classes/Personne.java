/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.miniprojet.classes;

/**
 *
 * @author Muhammed Fode
 */
public class Personne {
    
    private int ID;
    private String matricule;
    private String prenom;
    private String nom;
    private String adresse;
    private String date_de_naissance;
    private String telephone;
    private String email;
    private String situation_matrimoniale;

    public Personne() {
    }

    public Personne(int ID,String matricule,String prenom, String nom, String adresse, String date_de_naissance, String telephone, String email, String situation_matrimoniale) {
        this.ID = ID;
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.date_de_naissance = date_de_naissance;
        this.telephone = telephone;
        this.email = email;
        this.situation_matrimoniale = situation_matrimoniale;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String Date_de_naissance) {
        this.date_de_naissance = Date_de_naissance;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSituation_matrimoniale() {
        return situation_matrimoniale;
    }

    public void setSituation_matrimoniale(String situation_matrimoniale) {
        this.situation_matrimoniale = situation_matrimoniale;
    }

    @Override
    public String toString() {
        return "ID : " + ID + " - Matricule: "+ matricule + " - Prenom & Nom: " + prenom +" "+ nom;
    }
    
}
