package projet.holo_holo.weeja.model;

import java.util.HashSet;

/**
 * Created by Alex on 07/11/2016.
 */

public class User {

    private String email;
    private String password;
    private HashSet<Favorite> listeFavorites;

    public User(String email, String password, HashSet<Favorite> listeFavorites) {
        this.email = email;
        this.password = password;
        this.listeFavorites = listeFavorites;
    }

    public User() {
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
}
