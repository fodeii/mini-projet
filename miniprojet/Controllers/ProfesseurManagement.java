package sn.supinfo.javapoo.miniprojet.Controllers;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.javapoo.miniprojet.classes.Professeur;
import sn.supinfo.javapoo.miniprojet.interfaces.InterProfesseur;

/**
 *
 * @author Muhammed Fode
 */
public class ProfesseurManagement implements InterProfesseur {
    
    ArrayList<Professeur> professeurs = new ArrayList<>();
    @Override
    public void addProf(Professeur professeur) 
    {
        professeurs.add(professeur);
        System.out.println("Ajout effectué avec Succès!");
    }

    @Override
    public void editProf(Professeur professeur) 
    {
        for (Professeur professeur0:professeurs)
        {
            if(professeur0.getID()==professeur.getID())
            {
                professeur0.setNom(professeur.getNom());
                professeur0.setPrenom(professeur.getPrenom());
                professeur0.setDate_de_naissance(professeur.getDate_de_naissance());
                professeur0.setEmail(professeur.getEmail());
                professeur0.setTelephone(professeur.getTelephone());
                professeur0.setSituation_matrimoniale(professeur.getSituation_matrimoniale());
                System.out.println("Modification effectuée avec succès !");
            }
        }
    }
    @Override
    public Professeur getProfbyId(int id) {
        for (Professeur professeur:professeurs)
        {
            if(professeur.getID()==id){
                return professeur;
            }
        }
        return null;
    }

    @Override
    public void delProf(Professeur professeur) 
    {
        professeurs.remove(professeur);
        System.out.println("Suppression effectué avec succès !");
    }

    @Override
    public List<Professeur> getAllProf() 
    {
        System.out.println("------------------------Liste des professeurs------------------------");
        professeurs.forEach(professeur4 -> {
        System.out.println("Prenom & Nom: "+professeur4.getPrenom()+" " + professeur4.getNom() + " Specialité: " + professeur4.getSpecialite());
        });
       System.out.println("----------------------------------------------------------------------");
        return null;
    }  
}
