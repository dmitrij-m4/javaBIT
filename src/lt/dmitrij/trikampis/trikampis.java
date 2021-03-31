

package lt.dmitrij.trikampis;

import java.util.Scanner;

public class trikampis {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("krastine a  : ");
        int a = in.nextInt();

        System.out.print("krastine b  : ");
        int b = in.nextInt();

        System.out.print("krastine c  : ");
        int c = in.nextInt();

        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("trikampis nesigauna");
        } else if ((a == b) || (b == c) || (a == c)) {
            System.out.println("trikampis lygiasonis");
        } else if ((a * a == b * b + c * c) || (c * c == b * b + a * a) || (b * b == a * a + c * c)) {
            System.out.println("trikambpis status");
        } else {
            System.out.println("trikampis ivairiasonis");
        }

        int d = a + b + c;
        System.out.println(d);

    }
}