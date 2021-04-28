package sn.supinfo.javapoo.miniprojet.Controllers;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.javapoo.miniprojet.classes.Etudiant;
import sn.supinfo.javapoo.miniprojet.interfaces.InterEtudiant;

/**
 *
 * @author Muhammed Fode
 */
public class EtudiantManagement implements InterEtudiant {
    
    ArrayList<Etudiant> etudiants = new ArrayList<>();
    @Override
    public void addEtudiant(Etudiant etudiant) 
    {
        etudiants.add(etudiant);
        System.out.println("Ajout effectué avec Succès!");
    }

    @Override
    public void editEtudiant(Etudiant etudiant) 
    {
        for (Etudiant etudiant0:etudiants)
        {
            if(etudiant0.getID()==etudiant.getID())
            {
                etudiant0.setNom(etudiant.getNom());
                etudiant0.setPrenom(etudiant.getPrenom());
                etudiant0.setDate_de_naissance(etudiant.getDate_de_naissance());
                etudiant0.setEmail(etudiant.getEmail());
                etudiant0.setTelephone(etudiant.getTelephone());
                etudiant0.setSituation_matrimoniale(etudiant.getSituation_matrimoniale());
                System.out.println("Modification effectué avec Succès!");
            }
        }
    }

    @Override
    public Etudiant getEtudiantbyId(int id) {
        for (Etudiant etudiant:etudiants)
        {
            if(etudiant.getID()==id){
                return etudiant;
            }
            else
            {
                System.out.println("Etudiant introuvable!");
            }
        }
        return null;
    }

    @Override
    public void delEtudiant(Etudiant etudiant) 
    {
        etudiants.remove(etudiant);
        System.out.println("Suppression effectué avec succès !");
    }

    @Override
    public List<Etudiant> getAllEtudiant() 
    {
        System.out.println("---------------------------Liste des etudiants--------------------------");
        etudiants.forEach(etudiant -> {
        System.out.println(etudiant.toString());
        });
        System.out.println("------------------------------------------------------------------------");
        return null;
    }
}
