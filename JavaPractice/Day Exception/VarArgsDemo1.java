public class VarArgsDemo1 {
    public void show(String...s) {
        for (String e : s) {
            System.out.println(e + "     ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarArgsDemo1 obj = new VarArgsDemo1();
        obj.show();
        obj.show("Sahil");
        obj.show("Sahil", "Kalapna");
        obj.show("Malar", "Priya", "Meghana");
    }
}