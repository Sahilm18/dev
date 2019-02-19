import java.util.Scanner;

public class Calc{
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        a= sc.nextInt();
        b= sc.nextInt();
        int c=a+b;
        int m=a*b;
        int d=a/b;
        int s=a-b;
        System.out.println("Sum is "+c);
        System.out.println("Difference is "+s);
        System.out.println("Product is "+m);
        System.out.println("Division is "+d);

    }

}