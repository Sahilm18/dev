import java.util.Scanner;

public class Even{

    public void show(int n){
        int i=0;
        while(i < n-1){
            i=i+2;
            System.out.println("Even"+i);
        }
    }

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        n= sc.nextInt();
        Even obj = new Even();
        obj.show(n);
    }
}