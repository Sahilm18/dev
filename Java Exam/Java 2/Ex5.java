public class Ex5 {
    public static void main(String[] args) {
        try {
           int x = 5/0;
        } catch(Exception e) {
            System.out.println("Hi");
        } catch(ArithmeticException e) {
            System.out.println("Divi zero");
        } catch(NumberFormatException e) {
            System.out.println("Numformat");
        }
    }
}