package sn.supinfo.javapoo.miniprojet.interfaces;
import java.util.List;
import sn.supinfo.javapoo.miniprojet.classes.Professeur;
/**
 *
 * @author Muhammed Fode
 */
public interface InterProfesseur{
    void addProf(Professeur professeur);
    void editProf(Professeur professeur);
    Professeur getProfbyId(int i);
    void delProf(Professeur professeur);
    List<Professeur> getAllProf();
}
