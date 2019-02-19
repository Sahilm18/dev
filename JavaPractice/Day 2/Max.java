import java.util.Scanner;
public class Max{

    public void check(int a,int b,int c){
        int m = a;
        if(m < b){
            m = b;
        }
        if (m < c){
            m = c;
        }
        System.out.println(m+ " is maximum");
        
    }

    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give 3 numbers: " );
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        Max obj = new Max();
        obj.check(a,b,c);

    }
}


/*
if (a > b && a > c){
            System.out.println(a+ " is maximum");
        }
        else if (b > c){
            System.out.println(b+ " is maximum");
        }
        else{
            System.out.println(c+ "is maximum");
        }
*/ 