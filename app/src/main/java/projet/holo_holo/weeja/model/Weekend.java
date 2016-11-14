package projet.holo_holo.weeja.model;

/**
 * Created by Alex on 14/11/2016.
 */

public class Weekend
{
    private Hotel hotel;
    private Restaurant restaurant;

    public Weekend() {
    }

    public Weekend(Hotel hotel, Restaurant restaurant) {
        this.hotel = hotel;
        this.restaurant = restaurant;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
}
