import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;


public class SortEmp {
    public static void main(String[] args){
        Comparator b = new BasicComparator();
        SortedSet<Employ> s = new TreeSet<Employ>(b);
        s.add(new Employ(1,"Kalpana",87223));
        s.add(new Employ(3,"Bhuvana",85223));
        s.add(new Employ(4,"Niru",65223));
        s.add(new Employ(5,"Sahil",97223));
        s.add(new Employ(2,"Malar",77223));
        for (Employ e : s) {
            System.out.println(e);
        }
    }
}