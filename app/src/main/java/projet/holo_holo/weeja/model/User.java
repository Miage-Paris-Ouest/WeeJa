package projet.holo_holo.weeja.model;

import java.util.HashSet;

/**
 * Created by Alex on 07/11/2016.
 */

public class User {

    private String email;
    private String password;
    private int nbEnfants;
    private int celibataire;
    private int budget;
    private String destinationFavorite;


    private HashSet<Favorite> listeFavorites;

    public User(String email, String password, HashSet<Favorite> listeFavorites) {
        this.email = email;
        this.password = password;
        this.listeFavorites = listeFavorites;
    }

    public User() {
    }

    public void setDestinatioFavorite(String destinatioFavorite) {
        this.destinationFavorite = destinatioFavorite;
    }

    public String getDestinatioFavorite() {

        return destinationFavorite;
    }

    public void setNbEnfants(int nbEnfants) {
        this.nbEnfants = nbEnfants;
    }

    public void setCelibataire(int celibataire) {
        this.celibataire = celibataire;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getNbEnfants() {

        return nbEnfants;
    }

    public int getCelibataire() {
        return celibataire;
    }

    public int getBudget() {
        return budget;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setListeFavorites(HashSet<Favorite> listeFavorites) {
        this.listeFavorites = listeFavorites;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public HashSet<Favorite> getListeFavorites() {
        return listeFavorites;
    }

    public Boolean emailValid(){
        if(this.email.contains("@")){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean passwordValid(){
        if(this.password.length() > 4){
            return true;
        }
        else{
            return false;
        }
    }
}
