import java.util.*;

class Calculate{
  int cube(int x){
  return x*x*x;
  }

  void getCube(int x){
      int res = cube(x);
      System.out.println(res);
  }

  public static void main(String args[]){
      int m;
      Scanner s = new Scanner(System.in);
        System.out.println("Give value : ");
        m= s.nextInt();
    Calculate c = new Calculate();
     c.getCube(m);
  }
}
