package  nogard.schritt5;

public class Nahrung extends Gegenstand {
    private final int nutrients;

    public Nahrung(String name, String description, float weight_kg, int nutrients) {
        super(name, description, weight_kg);
        this.nutrients = nutrients;
    }

    public int getNutrients() {
        return nutrients;
    }

    public String getInfo() {
        return super.getInfo() +
                getNutrients();
    }
}
