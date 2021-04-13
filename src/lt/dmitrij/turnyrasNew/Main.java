package lt.dmitrij.turnyrasNew;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      Human[] humans = new Human[] {
              new Human ("Jonas"),
              new Human ("Ona"),
              new Human ("Marija"),
              new Human ("Algis"),
              new Human ("Juozas"),
              new Human ("Juozas"),
              new Human ("Juozas"),
              new Human ("Juozas"),

      };
      for (int i = 0; i < humans.length; i = i + 2){
          Pair[] pairs = new Pair[] {
                  new Pair(humans[i], humans [i + 1])
          };
        System.out.println(Arrays.toString(pairs));
      }
        System.out.println(Arrays.toString(humans));
        Pair p1 = new Pair(humans[0], humans[1]);
        System.out.println(p1.title());
        System.out.println(p1.board());

        Pair p2 = new Pair(p1, humans[3]);
        System.out.println(p2.title());
        System.out.println(p2.board());
    }
}