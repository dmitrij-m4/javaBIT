package lt.dmitrij.newDienynas;

public class Mokinys {
    private String vardas;
    private String pavarde;
    private int klase;
    private int[] trimestras;

    public Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.trimestras = trimestras;
    }
    public double vidurkis() {
        double sum = 0.0;
        for (int m : trimestras) sum += m;
        return sum/ trimestras.length;
    }
    public String getVardas()  {
        return vardas;
    }
    public String getPavarde() {
        return pavarde;
    }
    public int getKlase(){

        if (klase > 10) {
            klase = 0;
        }
        return klase;

    }
    public int[] getTrimestras() {
        return trimestras;

    }

    public void setTrimestras(int[] trimestras) {
        this.trimestras = trimestras;
    }


}

