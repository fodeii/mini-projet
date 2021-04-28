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
public class Professeur extends Personne {
     private String specialite;

    public Professeur() {
    }

    public Professeur(String specialite) {
        this.specialite = specialite;
    }

    public Professeur(String specialite,int ID,String matricule, String prenom, String nom, String adresse, String date_de_naissance, String telephone, String email, String situation_matrimoniale) {
        super(ID,matricule,prenom, nom, adresse, date_de_naissance, telephone, email, situation_matrimoniale);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return super.toString() +"specialite : " + specialite + '}';
    }
    
}
