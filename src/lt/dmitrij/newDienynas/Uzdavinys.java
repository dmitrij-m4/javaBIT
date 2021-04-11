package lt.dmitrij.newDienynas;

import lt.dmitrij.dienynas.mokinys;

import java.util.Arrays;

public class Uzdavinys {
    public static void main(String[] args) {
        Mokinys[] mokiniai = {
                new Mokinys("Jonas", "Jonaitis", 10, new int[]{5, 9, 8}),
                new Mokinys("Petras", "Petraitis", 2, new int[]{2, 9, 10}),
                new Mokinys("Antanas", "Antanauskas", 1, new int[]{1, 9, 3}),
                new Mokinys("Stasys", "Stasaitis", 8, new int[]{1, 9, 10}),
                new Mokinys("Algis", "Stasaitis", 1, new int[]{1, 9, 6}),

        };
        print("Pradiniai", mokiniai);
        lygiuoti(mokiniai);
        print("Rezultatas", mokiniai);


        }
    static void print(String title, Mokinys[] m) {
        System.out.println(title);

        for (Mokinys mokinys :m) {
            System.out.println("Klase : " +  mokinys.getKlase() +" "+  mokinys.getVardas() +" "+  mokinys.getPavarde() +" "+ Arrays.toString(mokinys.getTrimestras()) + " vidurkis: " + mokinys.vidurkis());
        }

    }

    static void lygiuoti(Mokinys[] mok) {
        Arrays.sort(mok,(Mokinys a, Mokinys b) -> {
            if (a.getKlase() != b.getKlase()) return b.getKlase() - a.getKlase();
            if (a.vidurkis() < b.vidurkis()) return 1;
            if (a.vidurkis() > b.vidurkis()) return -1;
                return 0;

        });
    }
}
