package sn.supinfo.javapoo.miniprojet.interfaces;
import java.util.List;
import sn.supinfo.javapoo.miniprojet.classes.Etudiant;
/**
 *
 * @author Muhammed Fode
 */
public interface InterEtudiant{
    void addEtudiant(Etudiant etudiant);
    void editEtudiant(Etudiant etudiant);
    Etudiant getEtudiantbyId(int i);
    void delEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiant();
}