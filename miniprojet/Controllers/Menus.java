/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.miniprojet.Controllers;
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
     System.out.println("---MENU PRINCIPAL---");
     System.out.println("1 - Gestion Groupe");
     System.out.println("2 - Gestion Etudiant");
     System.out.println("3 - Gestion Professeurs");
     System.out.println("4 - Gestion Groupe-Etudiant");
     System.out.println("5- Quitter");
    }
    
    public static void menuGroupe()
    {
        System.out.println("------GESTION GROUPE------");
        System.out.println("1 - Créer un Groupe");
        System.out.println("2 - Modifier un Groupe");
        System.out.println("3 - Voir les détails d'un groupe");
        System.out.println("4 - Supprimer un groupe");
        System.out.println("5 - Afficher tous les groupes");
        System.out.println("6 - Retour");
    }
    
   
    
    public static void menuEtudiant()
    {
        System.out.println("------GESTION ETUDIANT------");
        System.out.println("1 - Ajouter un Etudiant");
        System.out.println("2 - Modifier un Etudiant");
        System.out.println("3 - Voir les détails d'un Etudiant ");
        System.out.println("4 - Supprimer un Etudiant");
        System.out.println("5 - Afficher tous les Etudiant");
        System.out.println("6 - Retour");
    }
    
    public static void menuProfesseur()
    {
        System.out.println("------GESTION PROFESSEUR------");
        System.out.println("1 - Ajouter un Professeur");
        System.out.println("2 - Modifier un Professeur");
        System.out.println("3 - Voir les détails d'un Professeur ");
        System.out.println("4 - Supprimer un Professeur");
        System.out.println("5 - Afficher tous les Professeur");
        System.out.println("6 - Retour");
    }
    
    public static void menuGroupeEtudiant()
    {
        System.out.println("------GESTION GROUPE ETUDIANT------");
        System.out.println("1 - Ajouter un Etudiant un groupe");
        System.out.println("2 - Retirer un Etudiant d'un groupe");
        System.out.println("3 - Afficher les groupes");
        System.out.println("4 - Retour");
    }
    
}
