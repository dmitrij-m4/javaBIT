package lt.dmitrij.turnyrasNew;

public class Pair implements  IGamer {
    private static int n = 1;
    final private IGamer a;
    final private IGamer b;
    final private int number;

    public Pair(IGamer a, IGamer b) {
        this.a = a;
        this.b = b;
        this.number = n++;
    }
        public String board(){
        return number + " " + a.title() + " - " +b.title();
        }
    @Override
    public String toString() {
        return number +
                " ) " + a + " - "+
                b ;
    }

    @Override
    public String title() {
        return number + " poros laimetojas";
    }
};

