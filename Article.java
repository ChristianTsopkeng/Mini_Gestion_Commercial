/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.project;

/**
 *
 * @author NGUIM
 */
public class Article {
    private int reference;
    private String designation;
    private double prixunitaire;
    private int quantitestock;
    
    public Article(int reference, String designation, double prixunitaire, int quantitestock){
        
    this.reference = reference ;
    this.designation = designation;
    this.prixunitaire = prixunitaire; 
    this.quantitestock = quantitestock;
    }
    public Article ( Article Artcl){
         reference = Artcl.reference ;
         designation = Artcl.designation;
         prixunitaire = Artcl.prixunitaire; 
         quantitestock = Artcl.quantitestock; 

    }
    public void Affiche (){
        System.out.println("Reference: "+reference);
        System.out.println("Designation: "+designation);
        System.out.println("Prixunitaire: "+prixunitaire);
        System.out.println("Quantitestock: "+quantitestock);

    }
    
    public int getreference(){
        return reference;
    }
    
    public String getdesignation(){
        return designation;
    }
    
    public double getprixumitaire(){
        return prixunitaire;
    }
    
    public int getquantitestock(){
        return quantitestock;
    }
    
    public void setreference(int reference){
        this.reference = reference;
    }
    
    public void setdesignation(String designation){
        this.designation = designation;
    }
    
    public void setprixunitaire(double prixunitaire){
        this.prixunitaire = prixunitaire;
    }
    
    public void setquantitestock(int quantitestock){
        this.quantitestock = quantitestock;
    }
}
