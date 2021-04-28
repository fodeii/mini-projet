package sn.supinfo.javapoo.miniprojet.classes;

/**
 *
 * @author Muhammed Fode
 */
public class Etudiant extends Personne {
     private String filiere;

    public Etudiant() {
    }
    
    

    public Etudiant(String filiere) {
        this.filiere = filiere;
    }

    public Etudiant(String filiere,int ID,String matricule, String prenom, String nom, String adresse, String date_de_naissance, String telephone, String email, String situation_matrimoniale) {
        super(ID,matricule,prenom, nom, adresse, date_de_naissance, telephone, email, situation_matrimoniale);
        this.filiere = filiere;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    @Override
    public String toString() {
        return super.toString() +" - Filière : " + filiere;
    }
    
}
