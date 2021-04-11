package lt.dmitrij.turnyras;

public class Mokinys {
    private String vardas;

    public Mokinys(String vardas) {
        this.vardas = vardas;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + vardas;
    }

    public String getVardas() {
        return vardas;
    }
}
