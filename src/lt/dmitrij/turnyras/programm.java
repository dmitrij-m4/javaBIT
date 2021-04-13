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
//                new Mokinys ("Mantas"),

        };
        System.out.println(Arrays.toString(mokinys));


        print("Pradinis sarašas: ", mokinys);
        System.out.println("***");
        firstRound("1 ratas - 1/4", mokinys);
        System.out.println("***");
//        print("Galutinis sarašas: ", mokinys);
    }



    static void print (String title, Mokinys[] m){
        System.out.println(title);
        for (Mokinys mokinys : m){
            System.out.println("Vardas : " + mokinys.getVardas());
        }
    }
    static void firstRound (String title, Mokinys[] m1 ){
        System.out.println(title);
        for (int i = 0; i <= m1.length; i = i + 2 ){


            if ((i + 1) == (m1.length)){
                System.out.println("Pusfinaliai: ");
                System.out.println((i - 2) + " ) " + (i - 5)  + " poros nugalėtojas    -    "+ m1[m1.length - 1].getVardas());
                System.out.println((i - 1) + " ) " + (i - 4) + " poros nugalėtojas    -    " + (i - 3) + " poros nugalėtojas");
                System.out.println("Finalas: ");
                System.out.println( (i - 2) +  " poros nugalėtojas    -    " + (i - 1) +" poros nugalėtojas ");
                return;

            }

            if ((m1.length ) == i){
                System.out.println("yes");
                System.out.println("Pusfinaliai: ");
                System.out.println((i - 3) + " ) " + (i - 7)  + " poros nugalėtojas    -   " + (i - 4) + " poros nugalėtojas");
                System.out.println((i - 2) + " ) " + (i - 6) + " poros nugalėtojas    -    " + (i - 5) + " poros nugalėtojas");
                System.out.println("Finalas: ");
                System.out.println( (i - 3) +  " poros nugalėtojas    -    " + (i - 2) +" poros nugalėtojas ");
                return;
            }


            System.out.println( ((i + 2) / 2 ) + " ) " + m1[i].getVardas() + " - " + m1[i + 1].getVardas());

        }

    }
    static void vardas2 (String title, Mokinys[] m1 ){
        System.out.println(title);
        for (int i = 1; i < m1.length; i = i + 2 ){
            System.out.println((m1[m1.length].getVardas()));
        }
    }



}







