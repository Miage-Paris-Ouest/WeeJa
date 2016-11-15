package projet.holo_holo.weeja.model;

/**
 * Created by Alex on 07/11/2016.
 */

public class Favorite {

    private String type;
    private String name;

    public Favorite() {
    }

    public Favorite(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getname() {
        return name;
    }
}
