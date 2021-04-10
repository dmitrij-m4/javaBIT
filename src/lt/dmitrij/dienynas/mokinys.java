package lt.dmitrij.dienynas;

public class mokinys {

    String vardas;
    String pavarde;
    int klase;
    int[] trimestras;



    mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.trimestras = trimestras;


    }

   public double vidurkis() {
        double vidurkis = 0.0;
        for (int i: trimestras) vidurkis += i;
        return vidurkis /trimestras.length;
    }





}