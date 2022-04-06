package nogard.schritt5;

public class Gegenstand {
    private String name;
    private String description;
    private float weight_kg;

    public Gegenstand(String name, String description, float weight_kg) {
        this.name = name;
        this.description = description;
        this.weight_kg = weight_kg;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getWeight_kg() {
        return weight_kg;
    }

    public String getInfo() {
        return "Name: " + name +
                "\nBeschreibung: " + description +
                "\nGewicht" + weight_kg +
                "\n";
    }
}
