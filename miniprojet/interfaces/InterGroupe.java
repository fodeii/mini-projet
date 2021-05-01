package sn.supinfo.javapoo.miniprojet.interfaces;
import java.util.List;
import sn.supinfo.javapoo.miniprojet.classes.Groupe;
/**
 *
 * @author Muhammed Fode
 */
public interface InterGroupe{
    void addGroup(Groupe groupe);
    void editGroup(Groupe groupe);
    Groupe getGroupbyId(int i);
    void delGroup(Groupe groupe);
    List<Groupe> getAllGroup();
}