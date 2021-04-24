package sn.supinfo.javapoo.miniprojet.classes;

//import java.util.ArrayList;

/**
 *
 * @author Muhammed Fode
 */

public class Groupe {
    private int ID;
    private String nom;
    private int ListEtudiant;

    public Groupe() {}
    

    public Groupe(int ID, String nom, int ListEtudiant) {
        this.ID = ID;
        this.nom = nom;
        this.ListEtudiant = ListEtudiant;
        
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

    public int getListEtudiant() {
        return ListEtudiant;
    }

    public void setListEtudiant(int ListEtudiant) {
        this.ListEtudiant = ListEtudiant;
    }

    @Override
    public String toString() {
        return "Groupe{" + "ID=" + ID + ", nom=" + nom + ", ListEtudiant=" + ListEtudiant + '}';
    }    
}
