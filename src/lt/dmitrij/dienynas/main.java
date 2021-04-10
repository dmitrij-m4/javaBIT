package lt.dmitrij.dienynas;


import java.util.Arrays;

public class main {


    public  static void  main(String[] args) {

        mokinys[] mokiniai = {
                new mokinys("Jonas", "Jonaitis", 3, new int[]{3, 9, 8}),
                new mokinys("Petras", "Petraitis", 2, new int[]{2, 9, 10}),
                new mokinys("Antanas", "Antanauskas", 1, new int[]{1, 9, 3}),
                new mokinys("Stasys", "Stasaitis", 1, new int[]{1, 9, 1}),
                new mokinys("Algis", "Stasaitis", 1, new int[]{1, 9, 6}),

        };

        for (int i = 0; i < mokiniai.length; i++) {
            System.out.println(mokiniai[i].vardas + " " + mokiniai[i].pavarde + " klase : " + mokiniai[i].klase
                    + " trimestro pazymiai: " + Arrays.toString(mokiniai[i].trimestras) );
            for (int k = 0; k < mokiniai.length; k++){
//                System.out.println(mokiniai[k].vardas + " " + mokiniai[k].pavarde + " klase : " + mokiniai[k].klase);
                if (mokiniai[i].klase < mokiniai[k].klase) {
                   int tarpinis = mokiniai[i].klase;
                    mokiniai[i].klase = mokiniai[k].klase;
                    mokiniai[k].klase = tarpinis;
                    String tarpinis1 = mokiniai[i].vardas;
                    mokiniai[i].vardas = mokiniai[k].vardas;
                    mokiniai[k].vardas = tarpinis1;
                    String tarpinis2 = mokiniai[i].pavarde;
                    mokiniai[i].pavarde = mokiniai[k].pavarde;
                    mokiniai[k].pavarde = tarpinis2;
                }
                else if ((mokiniai[i].klase == mokiniai[k].klase) && ((mokiniai[i].pavarde).compareToIgnoreCase(mokiniai[k].pavarde) < 0) ) {
                    String tarpinis1 = mokiniai[i].vardas;
                    mokiniai[i].vardas = mokiniai[k].vardas;
                    mokiniai[k].vardas = tarpinis1;
                    String tarpinis2 = mokiniai[i].pavarde;
                    mokiniai[i].pavarde = mokiniai[k].pavarde;
                    mokiniai[k].pavarde = tarpinis2;

                }

                else if ((mokiniai[i].klase == mokiniai[k].klase)
                        && ((mokiniai[i].pavarde).compareToIgnoreCase(mokiniai[k].pavarde) >= 0)
                        && ((mokiniai[i].vardas).compareToIgnoreCase(mokiniai[k].vardas)) < 0) {
                    String tarpinis1 = mokiniai[i].vardas;
                    mokiniai[i].vardas = mokiniai[k].vardas;
                    mokiniai[k].vardas = tarpinis1;


                }
            }
        }

        System.out.println("***");
        System.out.println("***");
        System.out.println("***");



//        static void spausdinti
//        for (int i = 0; i < mokiniai.length; i++) {
//
//
//            System.out.println(mokiniai[i].vardas + " " + mokiniai[i].pavarde + " klase : " + mokiniai[i].klase
//                    + " trimestro pazymiai: " + Arrays.toString(mokiniai[i].trimestras) + " vidurkis:  " );
//        }


//        int sum = 0;
//        public String vidurkis(){
//        for (int i = 0; i < mokiniai.length; i++) {
//            System.out.println(mokiniai[i].vardas + " " + mokiniai[i].pavarde + " klase : "
//                    + mokiniai[i].klase + " trimestro pazymiai : " + Arrays.toString(mokiniai[i].trimestras));
//            for (int j = 0; j < mokiniai[i].trimestras.length; j++) {
//                System.out.println(mokiniai[i].trimestras[j]);
//
//                 sum += mokiniai[i].trimestras[j];
//                System.out.println("sum is : " + sum);
//            }
//            return sum = 0;
//        }
//        }


    }



}