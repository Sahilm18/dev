import java.util.Scanner;


public class CtoN{
        public void calc(double c){
                double f;
                f=((9*c)/5)+32;
                System.out.println("Fahrenheit value is " + f);
        }

        public static void main(String[] args){
            double c;
            System.out.println("Enter Centigrade Value  ");
            Scanner sc= new Scanner(System.in);
            c=sc.nextDouble();

            CtoN obj = new CtoN();
            obj.calc(c);
         
        }
}        