package lt.dmitrij.turnyrasNew;

public class Human implements IGamer {
    private static int n = 1;
    final private String name;
    final private int number;

    public Human(String name) {
        this.name = name;
        this.number = n;
        n++;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  number + " " + name + " ";
    }

    @Override
    public String title() {
        return number + " " +  name;
    }
}
