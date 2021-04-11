package lt.dmitrij.turnyras;

import java.util.Arrays;

public class programm {
    public static void main(String[] args) {
        Mokinys[] mokinys = {
                new Mokinys("Petras"),
                new Mokinys ("Jonas"),
                new Mokinys ("Marytė"),
                new Mokinys ("Ona"),
                new Mokinys ("Ilona"),
                new Mokinys ("Juozas"),
                new Mokinys ("Marius"),

        };
        System.out.println(Arrays.toString(mokinys));


        print("Pradinis sarašas: ", mokinys);
        System.out.println("***");
        firstRound("1 ratas - 1/4", mokinys);
        System.out.println("***");
        print("Galutinis sarašas: ", mokinys);
    }



    static void print (String title, Mokinys[] m){
        System.out.println(title);
        for (Mokinys mokinys : m){
            System.out.println("Vardas : " + mokinys.getVardas());
        }
    }
    static String firstRound (String title, Mokinys[] m1 ){
        System.out.println(title);



        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                if (m1[i].getVardas().equals(m1[j].getVardas())) {
                   String vardas = m1[i].getVardas();

                   String vardas2 = m1[j].getVardas();



                    System.out.println(j + " " + vardas + " - " + vardas2);
                }



//        Arrays.sort(m1, programm::compare);
////            }
//        System.out.println(Mokinys[].classgetVardas() + " " + m1[].getVardas());
//            System.out.println("1) " + pirmasRaundas.getVardas() + " - " + pirmasRaundas.getVardas());
            }


//    private static int compare(Mokinys a, Mokinys b) {
//        if (a.getVardas().equals(b.getVardas())) return 0;
//        if (a.getVardas().compareToIgnoreCase(b.getVardas()) > 0 ) return 1;
//        if (a.getVardas().compareToIgnoreCase(b.getVardas()) < 0 ) return -1;
//        return 0;
//
//    }
        }
        return title;
    }}


