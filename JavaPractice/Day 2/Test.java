public class Test{

    int x;
    public static void main(String[] args){
        Test obj1 = new Test();
        obj1.x=12;
        Test obj2 = obj1;
        obj2.x = 13;
        System.out.println(obj1.x);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
    
}