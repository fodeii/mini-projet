package sn.supinfo.javapoo.miniprojet.Controllers;
import sn.supinfo.javapoo.miniprojet.classes.Etudiant;
import sn.supinfo.javapoo.miniprojet.classes.Groupe;
import sn.supinfo.javapoo.miniprojet.interfaces.InterGroupeEtudiant;

/**
 *
 * @author Muhammed Fode
 */
public class GroupeEtudiantManager implements InterGroupeEtudiant {
   GroupeManager GroupeManager = new GroupeManager();
    EtudiantManagement EtudiantManagement = new EtudiantManagement();
    
    
    
    @Override
    public void addEtudiant(Etudiant etudiant, Groupe groupe) {
        if(groupe.ListEtudiant.contains(etudiant))
        {
            System.out.println("L'Etudiant est déja dans le groupe!");
        }
        else
        {
        groupe.ListEtudiant.add(etudiant);
        System.out.println("L'Etudiant a été ajouter au groupe avec succès!");
        }
    }

    @Override
    public void DelEtudiant(Etudiant etudiant, Groupe groupe) {
        if(!groupe.ListEtudiant.contains(etudiant))
        {
            System.out.println("L'Etudiant n'est pas dans ce groupe!");
        }
        else
        {
        groupe.ListEtudiant.remove(etudiant);
        System.out.println("L'Etudiant a été supprimer du groupe avec succès!");
        }
    } 
}

