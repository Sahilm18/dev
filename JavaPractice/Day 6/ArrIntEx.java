import java.util.ArrayList;
import java.util.List;

public class ArrIntEx{
    public static void main(String[] args){
        List lsdData = new ArrayList();
        lsdData.add(new Integer(52));
        lsdData.add(new Integer(21));
        lsdData.add(new Integer(45));
        lsdData.add(new Integer(75));
        lsdData.add(new Integer(95));
        lsdData.add(new Integer(65));
        lsdData.add(new Integer(50));
        int sum=0;
        for (Object ob : lsdData) {
            sum+=(Integer)ob;
        }
        System.out.println("Sum is "+sum);

    }
}
