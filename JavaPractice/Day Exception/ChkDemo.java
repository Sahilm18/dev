import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ChkDemo {

    public void show(String dt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date doj = sdf.parse(dt);
        System.out.println(doj);
    }

    public static void main(String[] args) {
        ChkDemo obj = new ChkDemo();
        try {
            obj.show("2018/02-11");
        } catch(ParseException e) {
            // System.out.println(e);
            e.printStackTrace();
        }
    }
}