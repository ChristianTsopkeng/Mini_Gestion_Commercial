/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.project;

import java.util.Vector;
import java.util.*;
import static mini.project.MiniProject.programme;

/**
 *
 * @author NGUIM
 */

public class Commerciale {
   public Vector<Article>articles = new Vector<Article>();
   public Vector<Client> client_n = new Vector<Client>();
   public Vector<Commande> commandes = new Vector<Commande>();
    
 
    public Commerciale (Vector<Article> articles, Vector<Client> client_n,Vector<Commande> commandes){
        this.articles = articles; 
        this.client_n = client_n;
        this.commandes = commandes;
   }
   
   
public static void main (String []args){
    //Declaration de la variable choix
    int choix;
   
  Vector<Article> vect_article = new Vector<Article>();
  Vector<Commande> vect_commande = new Vector<Commande>();
  Vector<Client> vect_client = new Vector<Client>();
  
  Commerciale comm= new Commerciale(vect_article,vect_client,vect_commande);
  
  Article nouv_article = new Article(1,"",0,0);
  Personne nouv_personne = new Personne (0,"","");
  Client nouv_client = new Client (nouv_personne,0);
  Date nouv_date = new Date(0,0,0);
  Commande nouv_commande =new Commande(0,nouv_client,nouv_date);
  
  do{
        System.out.println("---Gestion Commerciale---");
        System.out.println("1) Ajouter un aricle");
        System.out.println("2) Supprimer un aricle");
        System.out.println("3) Ajouter un client");
        System.out.println("4) Supprimer un client");
        System.out.println("5) Passer une commande");
        System.out.println("6) Annuler une commande");
        System.out.println("0) Quitter ");

        System.out.println("Que voulez-vous faire?");
        Scanner var = new Scanner(System.in);
         choix = var.nextInt(); 
         switch(choix){
            case 0:
                 break;
                 
            case 1:
             comm.AjouterArticle(nouv_article);
             break;
             
            case 2:
                comm.SupprimerArticle(nouv_article);
                break;
            case 3:
                comm.AjouterClient(nouv_client);
                break;
            case 4:
                comm.SupprimerClient(nouv_client);
                break;
            case 5:
                comm.Passercommande(nouv_commande);
                break;
            case 6:
                comm.annulercommande(nouv_commande);
                break;
            default:
                System.out.println("Erreure mauvais numero!");
           
         }
   }while(choix!=0);    
 
}

public  void Passercommande (Commande c){
                Scanner var = new Scanner(System.in);  
                System.out.println("Entrer le numero de la commande: ");
                int numcommande = var.nextInt();
                
                System.out.println("Entrer la date de la commande: ");
                int jour=-1;
                do{
                System.out.println("Jour: ");
                jour = var.nextInt();
                }while(jour<1 || jour>31);
                
                int moi=-1;
                do{
                System.out.println("Moi: ");
                moi = var.nextInt();
                }while(moi<1 || moi>12);
                
                int annee=-1;
                do{
                System.out.println("Annee: ");
                annee = var.nextInt();
                }while(annee<1850 || annee>2023);//Annee actuelle
                
                Date date_commandes = new Date(jour,moi,annee);
                
                System.out.println("Entrer l'identifiant du client: ");
                int ident_clientc = var.nextInt();
                
                System.out.println("Entrer le nom social du client: ");
                String nomsociale_clientc = var.nextLine();
                nomsociale_clientc = var.nextLine();
                
                System.out.println("Entrer l'adresse du client: ");
                String adresse_clientc = var.nextLine();
                
                System.out.println("Entrer le chiffre d'affaire du client: ");
                double chiff_aff_clientc =var.nextDouble();
                
                
                Personne p2= new Personne(ident_clientc,nomsociale_clientc,adresse_clientc);
                Client client_c = new Client(p2,chiff_aff_clientc);
                commandes.add(new Commande(numcommande,client_c,date_commandes));
                
                System.out.println("La liste des commandes: ");
                for(Commande a: commandes)
                   a.Affiche();
                System.out.println("Taille: "+commandes.size());
                
                
} 
public void annulercommande(Commande c){
                Scanner var = new Scanner(System.in);
                System.out.println("---Recherche/Verifions l'article---");
                System.out.println("Entrer le numero de la commande a annulee: ");
                int num_comm_rech = var.nextInt();
               Commande comx = null;
               for(Commande com : commandes){
               if(com.getnumcomm()==num_comm_rech)
               comx=com;
               }

              System.out.println("Demarrage de la suppression : " );
              
              boolean okcomm = commandes.remove(comx);
              if (okcomm) {
              System.out.println("Commande "+num_comm_rech+" a ete supprimée");
               }

              else {
               System.out.println("Commande "+num_comm_rech+" n'est pas existant dans le vecteur");
              }

              System.out.println("---Apres la suppression---");
              for(Commande a : commandes)
              a.Affiche();
              System.out.println("Taille: "+commandes.size());
              
}
public final void AjouterArticle(Article art) {
                Scanner var = new Scanner(System.in);  

                System.out.println("Entrer la refference de cet article: ");
                String designation_article ;

                int reference = var.nextInt();
                                
                System.out.println("Entrer le prix unitaire de cet article: ");
                double prixunitaire_article = var.nextDouble();
                
                System.out.println("Entrer la quantiter en stocke de cette article: ");
                int quantstocx_article =var.nextInt();
                
                System.out.println("Entrer la designation de cet article: ");
                designation_article = var.nextLine();
                designation_article = var.nextLine();
                
                articles.add(new Article(reference,designation_article,prixunitaire_article,quantstocx_article));
                
                System.out.println("La liste des articles: ");
                for(Article a: articles)
                    a.Affiche();
                System.out.println("Taille: "+articles.size());
} 
public void SupprimerArticle(Article art){
                Scanner var = new Scanner(System.in);  

                System.out.println("---Recherche/Verifions l'article---");
                System.out.println("Entrer la reference de l'article a supprimer: ");
                int ref = var.nextInt();
               Article ax = null;
               for(Article a : articles){
               if(a.getreference()==ref)
               ax=a;
               }

              System.out.println("Démarrage de la suppression : " );
              boolean ok = articles.remove(ax);
              if (ok) {
              System.out.println("Article "+ref+" a ete supprimée");
               }

              else {
               System.out.println("Article "+ref+" n'est pas existant dans le vecteur");
              }

              System.out.println("---Apres la suppression---");
              for(Article a : articles)
              a.Affiche();
              System.out.println("Taille: "+articles.size());
}
            public void AjouterClient(Client c){
                Scanner var = new Scanner(System.in);  

                System.out.println("Entrer l'identifiant du client: ");
                int ident_client = var.nextInt();
                
                System.out.println("Entrer le nom social du client: ");
                String nomsociale_client = var.nextLine();
                nomsociale_client = var.nextLine();
                
                
                
                System.out.println("Entrer l'adresse du client: ");
                String adresse_client = var.nextLine();
                
                System.out.println("Entrer le chiffre d'affaire du client: ");
                double chiff_aff_client =var.nextDouble();
                
                Personne p1= new Personne(ident_client,nomsociale_client,adresse_client);
                client_n.add(new Client(p1,chiff_aff_client));
                
                System.out.println("---La liste des articles--- ");
                for(Client a: client_n)
                   a.affiche();
                System.out.println("Taille: "+client_n.size());
            }
            public void SupprimerClient(Client cn){
                Scanner var = new Scanner(System.in);  
                System.out.println("---Recherche/Verifions l'article---");
                System.out.println("Entrer l'identifiant du client a supprimer: ");
                int ident = var.nextInt();
               Client cx = null;
               for(Client c : client_n){
               if(c.getident()==ident)
               cx=c;
               }

              System.out.println("Démarrage de la suppression : " );
              // suppression de l’objet px de la classe Article
              boolean okclient = client_n.remove(cx);
              if (okclient) {
              System.out.println("Client "+ident+" a ete supprimée");
               }

              else {
               System.out.println("Client "+ident+" n'est pas existant dans le vecteur");
              }

              System.out.println("---Apres la suppression---");
              for(Client a : client_n)
              a.affiche();
              System.out.println("Taille: "+client_n.size());
            }
}
