import java.util.HashMap;
import java.util.Map;
public class MapTest {
    public static void main(String args[]){
        Map m= new HashMap();
        m.put(null, "Test");
        m.put(null,"Fest");
        System.out.println(m);
    }
}