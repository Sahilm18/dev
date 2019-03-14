public class Test {
    private static float temp(){
        float sum = 21;
        return (--(sum));
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.temp());
    }
}