/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.miniprojet;

import java.util.ArrayList;

/**
 *
 * @author Muhammed Fode
 */

public  class Groupe {
    private int ID;
    private String nom;
    private int effectif;

    public Groupe() {}
    
    public Groupe(int ID, String nom, int effectif) {
        this.ID = ID;
        this.nom = nom;
        this.effectif = effectif;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    @Override
    public String toString() {
        return "Groupe{" + "ID=" + ID + ", nom=" + nom + ", effectif=" + effectif + '}';
    }
    
    ArrayList<Groupe> Groupes = new ArrayList<>();
    
    public static void addGroup(int ID, String nom, int effectif)
    {
             Groupe grp = new Groupe();
             //Groupes.add(new Groupe(ID,nom,effectif));
             System.out.println("Ajout effectué avec Succès!");
    }
    
    public void editGroup(String choix2)
    {
        System.out.println(Groupes);
//for (String i : Groupes)
    }
    
    
    
}
