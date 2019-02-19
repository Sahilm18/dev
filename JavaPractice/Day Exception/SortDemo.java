import java.util.SortedSet;
import java.util.TreeSet;
public class SortDemo {
    public static void main(String[] args) {
        SortedSet s = new TreeSet();
        s.add("Sahil");
        s.add("Niru");
        s.add("Kalpana");
        s.add("Tamil");
        s.add("Niki");
        for (Object ob : s) {
            System.out.println(ob);
        }
    }
}