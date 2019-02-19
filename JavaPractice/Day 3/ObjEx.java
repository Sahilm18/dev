public class ObjEx{
    public void show(Object ob){
        if(ob=="A"){
            System.out.println("Hi");
        } else {
            System.out.println("Bye");
        }
    }

    public static void main(String[] args){
        String ob = "A";
        new ObjEx().show(ob);

        
    }
}