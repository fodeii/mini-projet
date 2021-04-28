package sn.supinfo.javapoo.miniprojet.Controllers;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.javapoo.miniprojet.classes.Etudiant;
import sn.supinfo.javapoo.miniprojet.classes.Groupe;
import sn.supinfo.javapoo.miniprojet.interfaces.InterGroupe;

/**
 *
 * @author Muhammed Fode
 */
public class GroupeManager implements InterGroupe {
    
    public ArrayList<Groupe> groupes = new ArrayList<>();
    public ArrayList<Etudiant> ListEtudiant = new ArrayList<>();
    @Override
    public void addGroup(Groupe groupe) 
    {
        groupes.add(groupe);
        System.out.println("Ajout effectué avec Succès!");
    }

    @Override
    public void editGroup(Groupe groupe) 
    {
    for (Groupe groupe0:groupes)
        {
            if(groupe0.getID()==groupe.getID())
            {
                groupe0.setNom(groupe.getNom());
                groupe0.setListEtudiant(groupe.getListEtudiant());
                System.out.println("Modification effectué avec Succès!");
            }
            else
            {
                System.out.println("Groupe non trouvé!");
            }
        }
    }

    
    @Override
    public Groupe getGroupbyId(int id) {
            for (Groupe groupe:groupes)
        {
            if(groupe.getID()==id){
                return groupe;
            }
            else
            {
                System.out.println("Groupe introuvable!");
            }
            break;
        }
        return null;
    }

    @Override
    public void delGroup(Groupe groupe) 
    {
        groupes.remove(groupe);
        System.out.println("Supression effectué avec Succès!");
    }

    @Override
     public List<Groupe> getAllGroup() 
    {
        System.out.println("----------------Groupes------------------");
        groupes.forEach(groupe -> {
        System.out.println("ID: "+groupe.getID()+ " - Nom: " + groupe.getNom() + " - Filière: " + groupe.getFiliere()+" - Liste Etudiant: " + groupe.getListEtudiant());
        });
        System.out.println("----------------------------------------");
        return null;
    }
     
    
  
}
