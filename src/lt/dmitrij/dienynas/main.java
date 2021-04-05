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
            new mokinys("Jonas", "Jonaitis", 1)
        };
        System.out.println(mokiniai[0].vardas + " " + mokiniai[0].pavarde + " klase : " + mokiniai[0].klase);
        }

    }