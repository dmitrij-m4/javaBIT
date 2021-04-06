package lt.dmitrij.dienynas;

public class main {
    public static void main(String[] args) {
        class mokinys {

            String vardas;
            String pavarde;
            int klase;

            mokinys(){}

            mokinys(String vardas, String pavarde, int klase){
                this.vardas = vardas;
                this.pavarde = pavarde;
                this.klase = klase;
            }
        }
        mokinys[] mokiniai =  {
            new mokinys("Jonas", "Jonaitis", 3),
            new mokinys("Petras", "Petraitis", 2),
                new mokinys("Antanas", "Antanauskas", 1),
                new mokinys("Stasys", "Stasaitis", 1),
                new mokinys("Algis", "Stasaitis", 1),

        };

        for (int i = 0; i < mokiniai.length; i++) {
            System.out.println(mokiniai[i].vardas + " " + mokiniai[i].pavarde + " klase : " + mokiniai[i].klase);
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
        for (int i = 0; i < mokiniai.length; i++) {

            System.out.println(mokiniai[i].vardas + " " + mokiniai[i].pavarde + " klase : " + mokiniai[i].klase);
        }
    }

    }