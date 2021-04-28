package sn.supinfo.javapoo.miniprojet.classes;

//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Muhammed Fode
 */

public class Groupe {
    private int ID;
    private String nom;
    private String filiere;
    public ArrayList<Etudiant> ListEtudiant = new ArrayList<>();

    public Groupe() {}
    

    public Groupe(int ID, String nom,String Filiere, List ListEtudiant) {
        this.ID = ID;
        this.nom = nom;
        this.ListEtudiant = (ArrayList<Etudiant>) ListEtudiant;
        this.filiere = Filiere;
        
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

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public List getListEtudiant() {
        return ListEtudiant;
    }

    public void setListEtudiant(List ListEtudiant) {
        this.ListEtudiant = (ArrayList<Etudiant>) ListEtudiant;
    }

    @Override
    public String toString() {
        return "Groupe{" + "ID=" + ID + ", nom=" + nom + ", filiere=" + filiere;
    }
    
    

   
}
