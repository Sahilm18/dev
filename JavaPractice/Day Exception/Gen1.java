import java.util.List;
import java.util.ArrayList;

public class Gen1 {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList();
        data.add(new Integer(42));
        data.add(new Integer(11));
        data.add(new Integer(75));
        data.add(new Integer(88));
        data.add(new Integer(38));

        int sum = 0;
        for(Integer ob : data) {
            sum += ob;
        }
        System.out.println(sum);
    }
}

//this is what we call Comparators.