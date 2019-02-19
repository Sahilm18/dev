import java.util.Scanner;
public class EvenOdd{

    public void check(int n){
        if (n%2 == 0) {
            System.out.println(n+" is an even number");
        } else {
            System.out.println(n+" is a odd number");
        }
    }

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        n = sc.nextInt();
        EvenOdd obj = new EvenOdd();
        obj.check(n);
      
    }
}