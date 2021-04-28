package sn.supinfo.javapoo.miniprojet.Controllers;
import java.util.ArrayList;
import java.util.List;
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
    public List<Etudiant>etudiantsGroupe = new ArrayList<>();
    
    
    
    @Override
    public void addEtudiant(Etudiant etudiant, Groupe groupe) {
        if(groupe.ListEtudiant.contains(etudiant))
        {
            System.out.println("L'Etudiant est déja dans le groupe!");
        }
        else
        {
        etudiantsGroupe.add(etudiant);
        groupe.setListEtudiant(etudiantsGroupe);
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
        etudiantsGroupe.remove(etudiant);
        System.out.println("L'Etudiant a été supprimer du groupe avec succès!");
        }
    } 
}
