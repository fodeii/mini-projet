/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.miniprojet.interfaces;

import sn.supinfo.javapoo.miniprojet.classes.Etudiant;
import sn.supinfo.javapoo.miniprojet.classes.Groupe;

/**
 *
 * @author Muhammed Fode
 */
public interface InterGroupeEtudiant {
    void addEtudiant(Etudiant etudiant, Groupe groupe);
    void DelEtudiant(Etudiant etudiant, Groupe groupe);
}
