/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.project;

/**
 *
 * @author NGUIM
 */

public class Date {
   private int jour;
   private int moi;
   private int annee;
   
   public Date (int jour , int moi, int annee ){
       this.jour = jour; 
       this.moi = moi;
       this.annee = annee;
   }
   public void Affiche_date (){
       System.out.println("Jour: "+jour);
       System.out.println("Moi: "+moi);
       System.out.println("Annee: "+annee);
   }
   
   public int getjour(){
       return jour;
   }
   public int getmoi(){
       return moi;
   }
   public int getanne(){
       return annee;
   }
   
   public void setjour (int jour){
       this.jour = jour;
   }
   
   public void setmoi (int moi){
       this.moi = moi;
   }
      
   public void setannee (int annee){
       this.annee = annee;
   }
   
}