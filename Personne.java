/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.project;

/**
 *
 * @author NGUIM
 */
public class Personne {
    protected int ident;
    protected String nomsocial ;
    protected String adresse ;
    
    public void affiche(){
        System.out.println("Ident: "+ident);
        System.out.println("Nomsocial: "+nomsocial);
        System.out.println("Adresse: "+adresse);
    }
    
    protected Personne (int ident, String nomsocial, String adresse){
        this.ident = ident;
        this.nomsocial = nomsocial;
        this.adresse = adresse;
    }
    
    protected int getident(){
        return ident;
    }
    protected String getnomsocial(){
        return nomsocial;
    }
    
    protected String getadresse(){
        return adresse;
    }
    protected void setident(int ident){
        this.ident = ident;
    }
    protected void setadresse(String adresse){
        this.adresse = adresse;
    }
    protected void setnomsocial(String nomsocial){
        this.nomsocial = nomsocial;
    }
    
}