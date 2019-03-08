public class Java {
    private Kuch(int w){
        System.out.println(w);
    }

    private static Kuch(){
        System.out.println(10);
    }

    public static void main(String args []) {
        Java obj = new Java();
        obj.Kuch(50);
    }
}