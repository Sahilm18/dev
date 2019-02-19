import java.util.Scanner;

public class CaseDemo{

    public void choice(int n){
        switch(n){
            case 1 : System.out.println("Linux");
                     break;
            case 2 : System.out.println("GIt");
                     break;
            case 3 : System.out.println("SQL");
                     break;
            case 4 : System.out.println("JAVA");
                     break;
            default :
                    System.out.println("Invalid choice");
                    break;                                   

        }
    }

    public static void main(String[] args){
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a choice: ");
        ch = sc.nextInt();
        CaseDemo obj = new CaseDemo();
        obj.choice(ch);

    }
}