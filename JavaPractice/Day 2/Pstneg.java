import java.util.Scanner;
public class Pstneg{

    public void check(int n){
        if (n < 0) {
            System.out.println(n+" is a negative number");
        } else {
            System.out.println(n+" is a positive number");
        }
    }

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        n = sc.nextInt();
        Pstneg obj = new Pstneg();
        obj.check(n);
      
    }
}