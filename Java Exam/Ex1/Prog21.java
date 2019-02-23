import java.util.ArrayList;
import java.util.List;

public class Prog21 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
    list.add(101); // auto boxing will work
    int aValue = list.get(0); // auto unboxing will work, too

    System.out.println(aValue); 
    }
}