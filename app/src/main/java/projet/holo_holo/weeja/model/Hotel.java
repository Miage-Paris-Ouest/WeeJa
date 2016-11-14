package projet.holo_holo.weeja.model;

/**
 * Created by Alex on 14/11/2016.
 */

public class Hotel {

    private String name;
    private String webURL;
    private String priceLevel;
    private Address address;
    private float rating;
    private int ranking;
    private String longitude;
    private String latitude;

    public Hotel() {
    }

    public Hotel(String name, String webURL, String priceLevel, Address address, float rating, String longitude, String latitude) {
        this.name = name;
        this.webURL = webURL;
        this.priceLevel = priceLevel;
        this.address = address;
        this.rating = rating;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }

    public void setpriceLevel(String priceLevel) {
        this.priceLevel = priceLevel;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public String getWebURL() {
        return webURL;
    }

    public String getPriceLevel() {
        return priceLevel;
    }

    public int getRanking() {
        return ranking;
    }

    public Address getAddress() {
        return address;
    }

    public float getRating() {
        return rating;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }
}
