/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo.miniprojet;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Muhammed Fode
 * Ceci est le fichier principale contenant le main.
 */
public class Accueil {
    public static void main (String[] args)
    {
     Scanner sc = new Scanner(System.in);
     Menus.menuPrincipal();
     int choix = sc.nextInt();
     if (choix == 1)
        {
         premierePartie:
         Menus.menuGroupe();
         Scanner sc0 = new Scanner(System.in);
         int choixG = sc0.nextInt();
         switch (choixG){
         case 1 :
         {
             int ID,effectif;
             String nomGroupe;
             Scanner sc1 = new Scanner(System.in);
             System.out.println("Saisissez l'ID du nouveau groupe:");
             ID = sc1.nextInt();
             Scanner sc2 = new Scanner(System.in);
             System.out.println("Saisissez 1e nom du nouveau groupe:");
             nomGroupe = sc2.next();
             Scanner sc3 = new Scanner(System.in);
             System.out.println("Saisissez l'effectif");
             effectif = sc3.nextInt();
             Groupe.addGroup(ID,nomGroupe,effectif);
             /*le break ci dessous ne fonctionne pas. Je voulais utiliser le concept d'etiquette
             pour revenir a la ligne 24 mais j'ai toujours un erreur*/
             break premierePartie;
         }
         
         case 2 :
         {
             System.out.println("Entrez le nom du groupe a modifer: ");
             Scanner sc4 = new Scanner(System.in);
             String choix2 = sc4.next();
         }
         /*if (choix == 2)
         {
             System.out.println("Entrez le nom du groupe a modifer: ");
             Scanner sc4 = new Scanner(System.in);
             String choix2 = sc4.next();
             
         }*/
        }
    }
  }
}
