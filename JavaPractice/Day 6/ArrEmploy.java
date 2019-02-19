import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
    public static void main(String[] args){
        List lstEmploy = new ArrayList();
        lstEmploy.add(new Employ(1, "Vinata", 52111));
        lstEmploy.add(new Employ(2, "Ram", 88111));
        lstEmploy.add(new Employ(3, "Kalyani", 23111));
        lstEmploy.add(new Employ(4, "Madhu", 78111));
        lstEmploy.add(new Employ(5, "Srikar", 31111));

        for (Object ob : lstEmploy){
            EDateEx1.javamploy e= (Employ)ob;
            System.out.println(e);
        }


    }
}