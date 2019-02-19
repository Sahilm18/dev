public class ConEx{
    static{
        System.out.println("Static construtor...");
    }
    ConEx(){
        System.out.println("General Constructor..");
    }

    public static void main(String[] args){
        ConEx obj = new ConEx();
        

    }
}