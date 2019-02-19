import java.util.*;

public class EvenOdd {


    public void check (int n) {
       boolean flag = true;

if (n < 0) {
    flag=false;
    throw new ArithmeticException("Negative no. not allowed");
}
if (n == 0) {
    flag = false;
    throw new ArrayIndexOutOfBoundsException("Zero is invalid value...");
}
if (flag==true) {
    if (n%2==0) {
        System.out.println("Even number...");
    } else {
        System.out.println("Odd number");
    }
}  
}

public static void main(String[] args) {
    EvenOdd obj = new EvenOdd();
    try {
        obj.check(0);
    } catch(ArithmeticException e) {
        e.printStackTrace();
    } catch(ArrayIndexOutOfBoundsException e) {
        // e.printStackTrace();
    }
}
}