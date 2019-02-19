public class StDemo{
    public void show(){
        System.out.println("From Show method");
    }
    public static void display(){
        System.out.println("From Display Method");
    }

    public static void main(String[] args){
        StDemo.display();
        new StDemo().show();
    }
}