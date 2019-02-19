import java.util.InputMismatchException;
import java.util.Scanner;

public class Div{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            c=a/b;
            System.out.println("Division "+c);
        }catch(InputMismatchException e){
            System.out.println("Only Numbers");
        }catch(ArithmeticException e){
            System.out.println("Division by zero impossible");
        }catch (Exception e){
            e.printStackTrace();
        } 

        finally{
            System.out.println("Program from FTP batch");
        }
    }
}