/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mini.project;

/**
 *
 * Le main du Commerciale est plus performent
 */
import java.util.*;
public class MiniProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        int choix=-1;
       
        
    
        //Parie Vector 
        Vector<Article>articles = new Vector<Article>();
        Vector<Client>client_n = new Vector<Client>();
        Vector<Commande>commandes = new Vector<Commande>();
        
        
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
        String designation_article ;
         choix = var.nextInt();
        switch(choix){
            case 0:
                break;
                
            case 1:
                System.out.println("Entrer la refference de cet article: ");
                int reference = var.nextInt();
                                
                System.out.println("Entrer le prix unitaire de cet article: ");
                double prixunitaire_article = var.nextDouble();
                
                System.out.println("Entrer la quantiter en stocke de cette article: ");
                int quantstocx_article =var.nextInt();
                
                System.out.println("Entrer la designation de cet article: ");
                designation_article = var.nextLine();
                designation_article = var.nextLine();
                
                articles.add(new Article(reference,designation_article,prixunitaire_article,quantstocx_article));
                System.out.println("---Avant la suppression--- ");
                System.out.println("La liste des articles: ");
                for(Article a: articles)
                    a.Affiche();
                System.out.println("Taille: "+articles.size());
                programme(articles,client_n,commandes);
                        break;
                
            case 2:
                System.out.println("---Recherche/Verifions l'article---");
                System.out.println("Entrer la reference de l'article a supprimer: ");
                int ref = var.nextInt();
               Article ax = null;
               for(Article a : articles){
               if(a.getreference()==ref)
               ax=a;
               }

              System.out.println("Démarrage de la suppression : " );
              // suppression de l’objet px de la classe Article
              boolean ok = articles.remove(ax);
              if (ok) {
              System.out.println("Article "+ref+" a été supprimée");
               }

              else {
               System.out.println("Article "+ref+" n'est pas existant dans le vecteur");
              }

              System.out.println("---Après la suppression---");
              for(Article a : articles)
              a.Affiche();
              System.out.println("Taille: "+articles.size());
              programme(articles,client_n,commandes);
              break;

            
        case 3:
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
                programme(articles,client_n,commandes);
                break;
                
                
        case 4:
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
              System.out.println("Article "+ident+" a été supprimée");
               }

              else {
               System.out.println("Article "+ident+" n'est pas existant dans le vecteur");
              }

              System.out.println("---Après la suppression---");
              for(Article a : articles)
              a.Affiche();
              System.out.println("Taille: "+articles.size());
              programme(articles,client_n,commandes);
              break;
              
              
        case 5:
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
                
                //Vector<Commande>commandes = new Vector<Commande>();
                //client_n.add(new Client(p1,chiff_aff_client));
                Personne p2= new Personne(ident_clientc,nomsociale_clientc,adresse_clientc);
                Client client_c = new Client(p2,chiff_aff_clientc);
                commandes.add(new Commande(numcommande,client_c,date_commandes));
                
                System.out.println("---Avant la suppression--- ");
                System.out.println("La liste des commandes: ");
                for(Commande a: commandes)
                   a.Affiche();
                System.out.println("Taille: "+commandes.size());
                programme(articles,client_n,commandes);
                break;
                
                
        case 6:
                System.out.println("---Recherche/Verifions l'article---");
                System.out.println("Entrer le numero de la commande a annulee: ");
                int num_comm_rech = var.nextInt();
               Commande comx = null;
               for(Commande com : commandes){
               if(com.getnumcomm()==num_comm_rech)
               comx=com;
               }

              System.out.println("Démarrage de la suppression : " );
              // suppression de l’objet px de la classe Article
              boolean okcomm = commandes.remove(comx);
              if (okcomm) {
              System.out.println("Article "+num_comm_rech+" a été supprimée");
               }

              else {
               System.out.println("Article "+num_comm_rech+" n'est pas existant dans le vecteur");
              }

              System.out.println("---Après la suppression---");
              for(Article a : articles)
              a.Affiche();
              System.out.println("Taille: "+articles.size());
              programme(articles,client_n,commandes);
              break;
              
              
        default:
            System.out.println("Erreure mauvaise valeure essayer encore");
        } 
        
        
          
}
    
    //Founction Apple du main
  public static void programme(Vector<Article>articles,Vector<Client>client_n, Vector<Commande>commandes ){
        int choix=-1;
       
        
        do{
        //Parie Vector 

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
        String designation_article ;
         choix = var.nextInt();
        switch(choix){
            case 0:
                break;
                
            case 1:
                System.out.println("Entrer la refference de cet article: ");
                int reference = var.nextInt();
                                
                System.out.println("Entrer le prix unitaire de cet article: ");
                double prixunitaire_article = var.nextDouble();
                
                System.out.println("Entrer la quantiter en stocke de cette article: ");
                int quantstocx_article =var.nextInt();
                
                System.out.println("Entrer la designation de cet article: ");
                designation_article = var.nextLine();
                designation_article = var.nextLine();
                
                articles.add(new Article(reference,designation_article,prixunitaire_article,quantstocx_article));
                System.out.println("---Avant la suppression--- ");
                System.out.println("La liste des articles: ");
                for(Article a: articles)
                    a.Affiche();
                System.out.println("Taille: "+articles.size());
                        break;
                
            case 2:
                System.out.println("---Recherche/Verifions l'article---");
                System.out.println("Entrer la reference de l'article a supprimer: ");
                int ref = var.nextInt();
               Article ax = null;
               for(Article a : articles){
               if(a.getreference()==ref)
               ax=a;
               }

              System.out.println("Démarrage de la suppression : " );
              // suppression de l’objet px de la classe Article
              boolean ok = articles.remove(ax);
              if (ok) {
              System.out.println("Article "+ref+" a été supprimée");
               }

              else {
               System.out.println("Article "+ref+" n'est pas existant dans le vecteur");
              }

              System.out.println("---Après la suppression---");
              for(Article a : articles)
              a.Affiche();
              System.out.println("Taille: "+articles.size());
              break;

            
        case 3:
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
                break;
                
                
        case 4:
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
              System.out.println("Client "+ident+" a été supprimée");
               }

              else {
               System.out.println("Client "+ident+" n'est pas existant dans le vecteur");
              }

              System.out.println("---Après la suppression---");
              for(Client a : client_n)
              a.affiche();
              System.out.println("Taille: "+client_n.size());
              break;
              
              
        case 5:
                System.out.println("Entrer le numero de la commande: ");
                int numcommande = var.nextInt();
                
                System.out.println("Entrer la date de la commande: ");
                int jour=-1;
                do{
                System.out.println("Jour: ");
                jour = var.nextInt();
                }while(jour<0 || jour>31);
                
                int moi=-1;
                do{
                System.out.println("Moi: ");
                moi = var.nextInt();
                }while(moi<0 || moi<12);
                
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
                
                //Vector<Commande>commandes = new Vector<Commande>();
                //client_n.add(new Client(p1,chiff_aff_client));
                Personne p2= new Personne(ident_clientc,nomsociale_clientc,adresse_clientc);
                Client client_c = new Client(p2,chiff_aff_clientc);
                commandes.add(new Commande(numcommande,client_c,date_commandes));
                
                System.out.println("---Avant la suppression--- ");
                System.out.println("La liste des commandes: ");
                for(Commande a: commandes)
                   a.Affiche();
                System.out.println("Taille: "+commandes.size());
                break;
                
                
        case 6:
                System.out.println("---Recherche/Verifions l'article---");
                System.out.println("Entrer le numero de la commande a annulee: ");
                int num_comm_rech = var.nextInt();
               Commande comx = null;
               for(Commande com : commandes){
               if(com.getnumcomm()==num_comm_rech)
               comx=com;
               }

              System.out.println("Démarrage de la suppression : " );
              // suppression de l’objet px de la classe Article
              boolean okcomm = commandes.remove(comx);
              if (okcomm) {
              System.out.println("Commandes "+num_comm_rech+" a été supprimée");
               }

              else {
               System.out.println("Commandes "+num_comm_rech+" n'est pas existant dans le vecteur");
              }

              System.out.println("---Après la suppression---");
              for(Commande a : commandes)
              a.Affiche();
              System.out.println("Taille: "+commandes.size());
              break;
              
              
        default:
            System.out.println("Erreure mauvaise valeure essayer encore");
        } 
        
 
   }while(choix != 0);
}
}