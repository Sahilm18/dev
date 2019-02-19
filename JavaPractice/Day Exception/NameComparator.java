import java.util.Comparator;

public class NameComparator implements Comparator<Employ> {
    public int compare(Employ e1, Employ e2) {
        return e2.name.compareTo(e1.name);
    }
}
