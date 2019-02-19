import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

public class SortStu {
    public static void main(String[] args) {
        Comparator n = new StuNameComparator();
        SortedSet<Student> s = new TreeSet<Student>(n);
        s.add(new Student(1,"Sahil",9.2,"Mumbai"));
        s.add(new Student(2,"Niru",8.5,"Luxettipet"));
        s.add(new Student(3,"Kalpana",7.2,"Coimbatore"));
        s.add(new Student(4,"Tamil",9.2,"Coimbatore"));
        s.add(new Student(5,"Niki",9.2,"Bheed"));
        for (Student st : s) {
            System.out.println(st);
        }
    }
}