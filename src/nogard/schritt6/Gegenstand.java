package nogard.schritt6;

public class Gegenstand {
    private final String name;
    private final String description;
    private final double weight_kg;

    public Gegenstand(String name, String description, double weight_kg) {
        this.name = name;
        this.description = description;
        this.weight_kg = weight_kg;
    }

    public Gegenstand(String name, String description) {
        this.name = name;
        this.description = description;
        this.weight_kg = 0;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight_kg() {
        return weight_kg;
    }

    public String getInfo() {
        return "Name: " + name +
                "\nBeschreibung: " + description +
                "\nGewicht" + weight_kg +
                "\n";
    }
}
