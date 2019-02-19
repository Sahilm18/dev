import java.util.Comparator;

public class BasicComparator implements Comparator<Employ> {
    public int compare(Employ e1, Employ e2) {
        if (e1.basic <= e2.basic) {
            return -1;
        } else {
            return 1;
        }
    }
}