package level2.exercise2.model;

public class Restaurant {
    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Restaurant {" + "Name = '" + name + '\'' +
                ", Rating = " + rating + '}';
    }
}
