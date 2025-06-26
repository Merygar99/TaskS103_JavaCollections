package level2.exercise1.application;

import level2.exercise1.model.Restaurant;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Jackie´s", 3);
        Restaurant restaurant2 = new Restaurant("Jackie´s", 5);
        Restaurant restaurant3 = new Restaurant("Beach House", 5);
        Restaurant restaurant4 = new Restaurant("Beach House", 5);
        Restaurant restaurant5 = new Restaurant("The view", 4);

        HashSet<Restaurant> restaurants = new HashSet<>();

        if (addRestaurantToTheList(restaurant1, restaurants)) {
            restaurants.add(restaurant1);
        }

        if (addRestaurantToTheList(restaurant2, restaurants)) {
            restaurants.add(restaurant2);
        }

        if (addRestaurantToTheList(restaurant3, restaurants)) {
            restaurants.add(restaurant3);
        }

        if (addRestaurantToTheList(restaurant4, restaurants)) {
            restaurants.add(restaurant4);
        }

        if (addRestaurantToTheList(restaurant5, restaurants)) {
            restaurants.add(restaurant5);
        }

        for(Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }

    }

    public static boolean addRestaurantToTheList(Restaurant restaurant, HashSet<Restaurant> listOfRestaurants) {
        boolean aux = true;
        for (Restaurant actualRestaurant : listOfRestaurants) {
            if (actualRestaurant.getName().equalsIgnoreCase(restaurant.getName()) && actualRestaurant.getRating() == restaurant.getRating()) {
                aux = false;
            }
        }
        return aux;
    }
}
