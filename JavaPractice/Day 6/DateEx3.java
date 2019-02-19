import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;


public class DateEx3 {
    public static void main(String[] args) throws ParseException{
        String stDate, endDate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter StartDate (yyyy-MM-dd) ");
        stDate = sc.next();
        System.out.println("Enter EndDate (yyyy-MM-dd) ");
        endDate = sc.next();


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date sdate = sdf.parse(stDate);
        Date edate = sdf.parse(endDate);
        long diff = edate.getTime() - sdate.getTime();
        int noDays = (int)diff/(1000*60*60*24);
        System.out.println(noDays+1);


    }
}    