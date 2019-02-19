import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {

    public static void main(String[] args) {
        List lstNames = new ArrayList();
        lstNames.add("Vinata");
        lstNames.add("Ram");
        lstNames.add("Pushkar");
        lstNames.add("Gaurav");
        System.out.println("Elements of Arraylist are:" );
        for (Object ob : lstNames) {
            System.out.println(ob);
        }
        lstNames.add(2, "Kalyan");
        System.out.println("List after adding new Element: " );
        for (Object ob : lstNames){
            System.out.println(ob);
        }
        lstNames.add(2, "Sitharam");
        System.out.println("List after modify Element: " );
        for (Object ob : lstNames){
            System.out.println(ob);
        }
        lstNames.remove(0);
        System.out.println("List after removing by Element Index");
        for (Object ob : lstNames){
            System.out.println(ob);
        }
        System.out.println("List after removing by Element Name");
        lstNames.remove("Gaurav");
        for (Object ob : lstNames){
            System.out.println(ob);
        }




    }
}