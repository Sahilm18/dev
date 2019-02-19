import java.util.Scanner;
public class Factor{

    public void show(int n){
       for(int i=1; i<=n; i++){
           if (n%i == 0){
               System.out.println("Factor "+i);
           }
       }
    }

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        n = sc.nextInt();
        Factor obj = new Factor();
        obj.show(n);
      
    }
}