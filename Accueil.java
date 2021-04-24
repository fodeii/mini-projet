package sn.supinfo.javapoo.miniprojet.test;
import java.util.List;
import sn.supinfo.javapoo.miniprojet.classes.Groupe;
import sn.supinfo.javapoo.miniprojet.classes.Etudiant;
import sn.supinfo.javapoo.miniprojet.classes.GroupeManager;
import sn.supinfo.javapoo.miniprojet.Controllers.EtudiantManagement;
import sn.supinfo.javapoo.miniprojet.Menus;
//import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Muhammed Fode
 */
public class Accueil {
    public static void main (String[] args)
    {
     while(true)
     {
        Menus.menuPrincipal();
        Scanner sc = new Scanner(System.in);
        int choix0 = sc.nextInt();
        switch(choix0)
        {
            case 1:
           {

            Menus.menuGroupe();
            //Scanner sc0 = new Scanner(System.in);
            int choix1 = sc.nextInt();
            switch (choix1)
            {
            case 1 :
               {
                System.out.println("Saisissez l'ID du nouveau groupe:");
                int ID = sc.nextInt();
                System.out.println("Saisissez 1e nom du nouveau groupe:");
                String nomGroupe = sc.next();
                System.out.println("Saisissez l'effectif");
                int Effectif = sc.nextInt();
                Groupe groupe = new Groupe(ID,nomGroupe,Effectif);
                GroupeManager.addGroup(groupe);
                break;
               }
            case 2 :
                {
                     GroupeManager.listGroupe();
                }
            }
           }
            case 2:
            {
                Menus.menuEtudiant();
                EtudiantManagement EtudiantM = new EtudiantManagement();
                   int choix1 = sc.nextInt();
                   switch (choix1)
                   {
                   case 1 :
                       {
                          
                          System.out.println("Saisissez l'ID de l'Etudiant:");
                          int ID = sc.nextInt();
                          System.out.println("Saisissez le prenom de l'Etudiant:");
                          String prenom = sc.next();
                          System.out.println("Saisissez le nom de l'Etudiant:");
                          String nom = sc.next();
                          System.out.println("Saisissez l'adresse de l'Etudiant:");
                          String adresse = sc.next();
                          System.out.println("Saisissez la date de naissance de l'Etudiant:");
                          String date_de_naissance = sc.next();
                          System.out.println("Saisissez le telephone de l'Etudiant:");
                          String telephone = sc.next();
                          System.out.println("Saisissez l'email l'Etudiant:");
                          String email = sc.next();
                          System.out.println("Saisissez la situation matrimoniale de l'Etudiant:");
                          String situation_matrimoniale = sc.next();
                          System.out.println("Saisissez la filiere de l'Etudiant:");
                          String filiere = sc.next();
                          Etudiant etudiant = new Etudiant(filiere,ID,prenom,nom,adresse,date_de_naissance,telephone,email,situation_matrimoniale);
                          EtudiantM.addEtudiant(etudiant);
                          break;
                       }
                   case 2 :
                        {
                           System.out.println("test");
                           List<Etudiant>etudiants = EtudiantM.getAllEtudiant();
                           //EtudiantM.listEtudiants();
                        }

                   }

            }
       }

     }
    }
}
