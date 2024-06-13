package mini.project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUIM
 */
public class Client extends Personne {
    private double chiffre_affaire ;
    
    @Override
      public void affiche (){
     
     System.out.println("Chiffre d'affaire: "+chiffre_affaire);
     /*
     Ici on doit normalement faire un apple de la fonction affiche pour 
     afficher les info ident nomsocial adresse
     */
     System.out.println("Ident: "+ident);
     System.out.println("Nomsocial: "+nomsocial);
     System.out.println("Adresse: "+adresse);
    
 }
    
     Client(Personne pers, double chiffre_affaire){
        super(pers.ident,pers.adresse,pers.nomsocial);
        this.chiffre_affaire = chiffre_affaire;
    }
     
    
    public double getchiffre_affaire(){
        return chiffre_affaire;
    }
    
    public void setchiffre_affaire(double chiffre_affaire){
        this.chiffre_affaire = chiffre_affaire;
    }
    
}
