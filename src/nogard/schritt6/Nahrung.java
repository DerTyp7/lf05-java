package nogard.schritt6;

import nogard.schritt6.Gegenstand;

public class Nahrung extends Gegenstand {
    private final int nutrients;

    public Nahrung(String name, String description, int nutrients) {
        super(name, description);
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
