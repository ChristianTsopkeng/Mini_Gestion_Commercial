/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.project;

/**
 *
 * @author NGUIM
 */
public class Ligne {
    private Commande commande;
    private Article article;
    private int quantitecom;  
    public Ligne (Commande commande , Article article, int quantitecom){
        this.article =article;
        this.commande = commande;
        this.quantitecom = quantitecom;
        
    }
    public void affiche(){
        System.out.println("Commande num"+commande.getnumcomm());
        System.out.println("Commande client"+commande.getclient());
        System.out.println("Commande date"+commande.getdatecomm());
        System.out.println("Article "+article.getreference());
        System.out.println("Article "+article.getdesignation());
        System.out.println("Article "+article.getprixumitaire());
        System.out.println("Article "+article.getprixumitaire());
       System.out.println("Quantite commande "+quantitecom);
        
    }
    public Article getarticle (){
        return article;
    }
    public Commande getcommande (){
        return commande;
    }
    public int getquantitecom (){
        return quantitecom;
    }
    
    public void setarticle(Article article){
        this.article = article;
    }
    public void setcommande(Commande commande){
        this.commande = commande;
    }
    public void setquantitecom(int quantitecom){
        this.quantitecom = quantitecom;
    }
}