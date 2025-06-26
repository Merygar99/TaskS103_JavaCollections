package level1.exercise1.model;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Month {" + "Name = '" + name + '\'' + '}';
    }
}

