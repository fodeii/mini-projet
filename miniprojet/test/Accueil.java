package sn.supinfo.javapoo.miniprojet.test;
import sn.supinfo.javapoo.miniprojet.classes.Groupe;
import sn.supinfo.javapoo.miniprojet.classes.Etudiant;
import sn.supinfo.javapoo.miniprojet.classes.Professeur;
import sn.supinfo.javapoo.miniprojet.Controllers.ProfesseurManagement;
import sn.supinfo.javapoo.miniprojet.Controllers.GroupeManager;
import sn.supinfo.javapoo.miniprojet.Controllers.EtudiantManagement;
import sn.supinfo.javapoo.miniprojet.Controllers.Menus;
import sn.supinfo.javapoo.miniprojet.Controllers.GroupeEtudiantManager;
import java.util.Scanner;

/**
 *
 * @author Muhammed Fode
 */
public class Accueil {
    public static void main (String[] args)
    {
     GroupeManager GroupeManager = new GroupeManager();
     EtudiantManagement EtudiantManagement = new EtudiantManagement();
     ProfesseurManagement ProfesseurManagement = new ProfesseurManagement();
     GroupeEtudiantManager GroupeEtudiantManager = new GroupeEtudiantManager();
     boolean var = true;
     while(var)
     {
        Menus.menuPrincipal();
        Scanner sc = new Scanner(System.in);
        int choixMenuPrincipal = sc.nextInt();
        switch(choixMenuPrincipal)
        {
            case 1:
           {
            boolean var0= true;
            while(var0)
            {
                Menus.menuGroupe();
                int choixGroupe = sc.nextInt();
                switch (choixGroupe)
                {
                    case 1 :
                       {
                        System.out.println("---Ajout d'un nouveau groupe---");
                        System.out.println("Saisissez l'ID du nouveau groupe:");
                        int ID = sc.nextInt();
                        System.out.println("Saisissez 1e nom du nouveau groupe:");
                        String nomGroupe = sc.next();
                        System.out.println("Saisissez 1a filière du nouveau groupe:");
                        String Filiere = sc.next();
                        Groupe groupe0 = new Groupe(ID,nomGroupe,Filiere,GroupeManager.ListEtudiant);
                        GroupeManager.addGroup(groupe0);
                        break;
                       }
                    case 2 :
                        {
                          System.out.println("---Modification d'un Groupe---\n Saisissez l'ID du Groupe dont vous souhaitez modifier les informations:");
                          int ID = sc.nextInt();
                          Groupe groupe1 = GroupeManager.getGroupbyId(ID);
                          System.out.println("Vous allez modifier le groupe suivant: " + groupe1.getNom());
                          System.out.println("Saisissez le nom :");
                          String NewNom = sc.next();
                          System.out.println("Saisissez la filiere:");
                          String NewFiliere = sc.next();
                          groupe1.setNom(NewNom);
                          groupe1.setFiliere(NewFiliere);
                          GroupeManager.editGroup(groupe1);
                          break;
                        }
                    case 3 :
                    {
                        System.out.println("---Detail d'un Groupe---\n Saisissez l'ID du Groupe dont vous souhaitez afficher les informations:");
                        int ID = sc.nextInt();
                        Groupe groupe2 = GroupeManager.getGroupbyId(ID);
                        System.out.println("ID: "+groupe2.getID() + " Nom: " +groupe2.getNom()+" Filiere: "+ groupe2.getFiliere());
                        break;
                    }
                    case 4 :
                    {
                        System.out.println("---Suppression d'un Groupe---\nSaisissez l'ID du Groupe à supprimer: ");
                        int ID = sc.nextInt();
                        Groupe groupe3 = GroupeManager.getGroupbyId(ID);
                        GroupeManager.delGroup(groupe3);
                        break;
                    }
                    case 5 :
                        {
                            GroupeManager.getAllGroup();
                            break;
                        }
                    case 6 :
                    {
                        var0=false;
                        var = true;
                        break;
                    }
                    default:
                    {
                        System.out.println("Choix est indisponible!");
                        break;
                    }    
                }
            }
            break;
           }
            case 2:
            {
             boolean var1= true;
             while(var1){
                Menus.menuEtudiant();
                   int choixEtudiant = sc.nextInt();
                   switch (choixEtudiant)
                   {
                   case 1 :
                   {
                          System.out.println("---Ajout d'un nouvel Etudiant---");
                          System.out.println("Saisissez l'ID de l'Etudiant:");
                          int ID = sc.nextInt();
                          System.out.println("Saisissez le matricule de l'Etudiant:");
                          String matricule = sc.next();
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
                          String filiere= sc.next();
                          Etudiant etudiant0 = new Etudiant(filiere,ID,matricule,prenom,nom,adresse,date_de_naissance,telephone,email,situation_matrimoniale);
                          EtudiantManagement.addEtudiant(etudiant0);
                          break;
                       }
                   case 2 :
                       {
                          System.out.println("---Modification d'un Etudiant---\n Saisissez l'ID de l'Etudiant dont vous souhaitez modifier les informations:");
                          int ID = sc.nextInt();
                          Etudiant etudiant1 = EtudiantManagement.getEtudiantbyId(ID);
                          System.out.println("Vous allez modifier l'Etudiant suivant: " + etudiant1.getNom()+" "+etudiant1.getPrenom());
                          System.out.println("Saisissez le Prenom :");
                          String updatedPrenom = sc.next();
                          System.out.println("Saisissez le Nom:");
                          String updatedNom = sc.next();
                          System.out.println("Saisissez l'adresse de l'Etudiant:");
                          String updatedAdresse = sc.next();
                          System.out.println("Saisissez la date de naissance de l'Etudiant:");
                          String newDate_de_naissance = sc.next();
                          System.out.println("Saisissez le telephone de l'Etudiant:");
                          String newTelephone = sc.next();
                          System.out.println("Saisissez l'email l'Etudiant:");
                          String newEmail = sc.next();
                          System.out.println("Saisissez la situation matrimoniale de l'Etudiant:");
                          String newSituation_matrimoniale = sc.next();
                          System.out.println("Saisissez la filiere de l'Etudiant:");
                          String newFiliere= sc.next();
                          Etudiant EUpdated = new Etudiant(newFiliere,etudiant1.getID(),etudiant1.getMatricule(),updatedPrenom,updatedNom,updatedAdresse,newDate_de_naissance,newTelephone,newEmail,newSituation_matrimoniale);
                          EtudiantManagement.editEtudiant(EUpdated);
                          break;
                       }
                   case 3 :
                        {
                          System.out.println("---Detail d'Etudiant---\n Saisissez l'ID de l'Etudiant dont vous souhaitez afficher les informations:");
                          int ID = sc.nextInt();
                          Etudiant etudiant2 = EtudiantManagement.getEtudiantbyId(ID);
                          System.out.println("-----------------------------------Resultat-----------------------------------");
                          System.out.println(etudiant2.toStringDetails());
                          break;
                        }
                   case 4 :
                        {
                            System.out.println("---Suppression d'un Etudiant---\nSaisissez l'ID de l'Etudiant à supprimer: ");
                            int ID = sc.nextInt();
                            Etudiant etudiant3 = EtudiantManagement.getEtudiantbyId(ID);
                            EtudiantManagement.delEtudiant(etudiant3);
                            break;
                        }
                   case 5 :
                        {
                            EtudiantManagement.getAllEtudiant();
                            break;
                        }
                   case 6 :
                       {
                          var1 = false;
                          var=true;
                          break;
                       }
                  default:
                        {
                            System.out.println("Choix est indisponible!");
                            break;
                        }
                   }
                }
            break;
            }
            case 3:
            {
             boolean var2= true;
             while(var2){
                Menus.menuProfesseur();
                   int choixProfesseur= sc.nextInt();
                   switch (choixProfesseur)
                   {
                   case 1 :
                       {
                          System.out.println("Saisissez l'ID du professeur:");
                          int ID = sc.nextInt();
                          System.out.println("Saisissez le matricule du professeur:");
                          String matricule = sc.next();
                          System.out.println("Saisissez le prenom du professeur:");
                          String prenom = sc.next();
                          System.out.println("Saisissez le nom du professeur:");
                          String nom = sc.next();
                          System.out.println("Saisissez l'adresse du professeur:");
                          String adresse = sc.next();
                          System.out.println("Saisissez la date de naissance du professeur:");
                          String date_de_naissance = sc.next();
                          System.out.println("Saisissez le telephone du professeur:");
                          String telephone = sc.next();
                          System.out.println("Saisissez l'email du professeur:");
                          String email = sc.next();
                          System.out.println("Saisissez la situation matrimoniale du professeur:");
                          String situation_matrimoniale = sc.next();
                          System.out.println("Saisissez la specialité du professeur:");
                          String specialite = sc.next();
                          Professeur professeur0 = new Professeur(specialite,ID,matricule,prenom,nom,adresse,date_de_naissance,telephone,email,situation_matrimoniale);
                          ProfesseurManagement.addProf(professeur0);
                          break;
                       }
                   case 2 :
                       {
                          System.out.println("---Modification d'un Professeur---\n Saisissez l'ID du Professeur dont vous souhaitez modifier les informations:");
                          int ID = sc.nextInt();
                          Professeur professeur1 = ProfesseurManagement.getProfbyId(ID);
                          System.out.println("Vous allez modifier le professeur suivant: " + professeur1.getNom());
                          System.out.println("Saisissez le Prenom :");
                          String updatedPrenom = sc.next();
                          System.out.println("Saisissez le Nom:");
                          String updatedNom = sc.next();
                          System.out.println("Saisissez l'adresse du Professeur:");
                          String updatedAdresse = sc.next();
                          System.out.println("Saisissez la date de naissance du Professeur:");
                          String newDate_de_naissance = sc.next();
                          System.out.println("Saisissez le telephone du Professeur:");
                          String newTelephone = sc.next();
                          System.out.println("Saisissez l'email du professeur:");
                          String newEmail = sc.next();
                          System.out.println("Saisissez la situation matrimoniale du Professeur:");
                          String newSituation_matrimoniale = sc.next();
                          System.out.println("Saisissez la specialité du Professeur:");
                          String newSpecialite= sc.next();
                          Professeur ProfUpdated = new Professeur(newSpecialite,professeur1.getID(),professeur1.getMatricule(),updatedPrenom,updatedNom,updatedAdresse,newDate_de_naissance,newTelephone,newEmail,newSituation_matrimoniale);
                          ProfesseurManagement.editProf(ProfUpdated);
                          break;
                       }
                   case 3 :
                        {
                          System.out.println("---Detail du professeur---\n Saisissez l'ID du professeur dont vous souhaitez afficher les informations:");
                          int ID = sc.nextInt();
                          Professeur professeur2 = ProfesseurManagement.getProfbyId(ID);
                          System.out.println(professeur2);
                          break;
                        }
                   case 4 :
                        {
                            System.out.println("---Suppression d'un Professeur---\nSaisissez l'ID du professeur à supprimer: ");
                            int ID = sc.nextInt();
                            Professeur professeur3 = ProfesseurManagement.getProfbyId(ID);
                            ProfesseurManagement.delProf(professeur3);
                            break;
                        }
                   case 5 :
                        {
                            ProfesseurManagement.getAllProf();
                            break;
                        }
                   case 6 :
                       {
                          var2 = false;
                          var=true;
                          break;
                       }
                   default:
                        {
                            System.out.println("Choix  indisponible!");
                            break;
                        }
                   }
                }
            break;
            }
            case 4:
            {
             boolean var2= true;
             while(var2){
                Menus.menuGroupeEtudiant();
                   int choixProfesseur= sc.nextInt();
                   switch (choixProfesseur)
                   {
                   case 1 :
                       {
                        GroupeManager.getAllGroup();
                        System.out.println("Saisissez l'ID du Groupe ou vous souhaitez ajouter l'Etudiant:");
                        int ID = sc.nextInt();
                        Groupe groupe5 = GroupeManager.getGroupbyId(ID);
                        EtudiantManagement.getAllEtudiant();
                        System.out.println("Saisissez l'ID de l'Etudiant à ajouter:");
                        int idEtudiant = sc.nextInt();
                        Etudiant etudiant = EtudiantManagement.getEtudiantbyId(idEtudiant);
                        GroupeEtudiantManager.addEtudiant(etudiant,groupe5);
                        break;
                       }
                   case 2 :
                       {
                        GroupeManager.getAllGroup();
                        System.out.println("Saisissez l'ID du Groupe de l'Etudiant:");
                        int ID = sc.nextInt();
                        Groupe groupe5 = GroupeManager.getGroupbyId(ID);
                        System.out.println(groupe5.getListEtudiant());
                        System.out.println("Saisissez l'ID de l'Etudiant à supprimer:");
                        int idEtudiant = sc.nextInt();
                        Etudiant etudiant = EtudiantManagement.getEtudiantbyId(idEtudiant);
                        GroupeEtudiantManager.DelEtudiant(etudiant,groupe5);
                        break;
                       }
                   case 3 :
                        {
                          GroupeManager.getAllGroup();
                          System.out.println("---Informations Groupe---\n Saisissez l'ID du Groupe que vous souhaitez afficher:");
                          int groupeID = sc.nextInt();
                          Groupe groupe6 = GroupeManager.getGroupbyId(groupeID);
                          System.out.println("-----------------------------------Resultat-----------------------------------");
                          System.out.println(groupe6.getNom() + " " + groupe6.ListEtudiant);
                          break;
                        }
                   case 4 :
                        {
                          var2 = false;
                          var=true;
                          break;
                        }
                   default:
                        {
                            System.out.println("Choix est indisponible!");
                            break;
                        }
                   }
                }
            }
            break;
            case 5:
            {
                System.exit(0);
            }
        }
       }
    }
}
