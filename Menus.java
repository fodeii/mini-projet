/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.miniprojet;

/**
 *
 * @author Muhammed Fode
 */
public class Menus {

    /**
     *
     */
    public static void menuPrincipal() 
    {
     System.out.println("1 - Gestion Groupe");
     System.out.println("2 - Gestion Etudiant");
     System.out.println("3 - Gestion Professeurs");
     System.out.println("4 - Gestion Groupe-Etudiant");
     System.out.println("5- Quitter");
    }
    
    public static void menuGroupe()
    {
        System.out.println("1 - Créer un Groupe");
        System.out.println("2 - Modifier un Groupe");
        System.out.println("3 - Voir les détails d'un groupe");
        System.out.println("4 - Supprimer un groupe");
        System.out.println("5 - Afficher tous les groupes");
        System.out.println("6 - Quitter");
    }
    
    public static void menuEtudiant()
    {
        System.out.println("1 - Ajouter un étudiant");
        System.out.println("2 - Modifier un étudiant");
        System.out.println("3 - Voir les détails d'un étudiant ");
        System.out.println("4 - Supprimer un étudiant");
        System.out.println("5 - Afficher tous les étudiant");
        System.out.println("6 - Quitter");
    }
    
    public static void menuProfesseur()
    {
        System.out.println("1 - Ajouter un professeur");
        System.out.println("2 - Modifier un professeur");
        System.out.println("3 - Voir les détails d'un professeur ");
        System.out.println("4 - Supprimer un professeur");
        System.out.println("5 - Afficher tous les professeur");
        System.out.println("6 - Quitter");
    }
    
}
