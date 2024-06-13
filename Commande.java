/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.project;
/**
 *
 * @author NGUIM
 */
public class Commande {
    private int numcomm;
    private Date datecomm;
    private Client client;
    //private String pers;

    public Commande(int numcomm, Client client,Date datecomm) {
        this.numcomm = numcomm;
        this.client = client;
        this.datecomm = datecomm;
    }
    
    public void Affiche (){
        System.out.println("Numero de commande:"+numcomm);
        System.out.println("Date commande:"+datecomm.getjour());
        System.out.println("Date commande:"+datecomm.getmoi());
        System.out.println("Date commande:"+datecomm.getanne());
        System.out.println("Nom social du Client:"+client.getnomsocial());
        System.out.println("Adresse Client:"+client.getadresse());
        System.out.println("Ident Client:"+client.getident());
        System.out.println("Chiffre affaire Client:"+client.getchiffre_affaire());
    }
    
    public int getnumcomm(){
        return numcomm;
    }
    public Date getdatecomm(){
        return datecomm;
    }
    public Client getclient(){
        return client;
    }
    public void setnumcomm(int numcomm){
        this.numcomm = numcomm;
    }
    public void setdatecomm(Date datecomm){
        this.datecomm = datecomm;
    }
    public void setclient(Client client){
        this.client = client;
    } 
}
