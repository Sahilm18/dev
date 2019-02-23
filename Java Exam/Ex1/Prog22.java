public class Prog22 {
    static {
      throw new Exception("my exception");
      System.out.println("2");
    }
  
    public static void main(String[] args) {
      System.out.println("1");
    }
  }