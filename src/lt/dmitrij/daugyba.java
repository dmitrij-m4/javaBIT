package lt.dmitrij;

public class daugyba
{public static void main (String[] args){

    for (int i =0 ; i < 10; i++){
        int a = 1;
        int b = 2;
        int c = 3;
        int sk1 = (a * i);
        int sk2 = (b * i);
        int sk3 = (c * i);
        String vienas = a + " x " + i + " = " + sk1;
        String du = b + " x " + i + " = " + sk2;
        String trys = c + " x " + i + " = " + sk3;

        System.out.println(vienas + "   " + du + "   " + trys);
    }

    System.out.println();


    for (int i =0 ; i < 10; i++){
        int a = 4;
        int b = 5;
        int c = 6;
        int sk1 = (a * i);
        int sk2 = (b * i);
        int sk3 = (c * i);
        String keturi = a + " x " + i + " = " + sk1;
        String penki = b + " x " + i + " = " + sk2;
        String sesi = c + " x " + i + " = " + sk3;

        System.out.println(keturi + "   " + penki + "   " + sesi);
    }

    System.out.println();

    for (int i =0 ; i < 10; i++){
        int a = 7;
        int b = 8;
        int c = 9;
        int sk1 = (a * i);
        int sk2 = (b * i);
        int sk3 = (c * i);
        String septyni = a + " x " + i + " = " + sk1;
        String astuoni = b + " x " + i + " = " + sk2;
        String devyni = c + " x " + i + " = " + sk3;

        System.out.println(septyni + "   " + astuoni + "   " + devyni);
    }


}
}
