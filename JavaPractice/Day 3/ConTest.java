public class ConTest{
    int a,b;
    public ConTest(){
        a=5;
        b=6;
    }
    public ConTest(int a){
        this.a=a;
        b=6;
    }
    public ConTest(int a,int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public final String toString(){
        return "A value "+a+" B value "+b;
    }
    public static void main(String[] args){
            ConTest obj1 = new ConTest();
            System.out.println(obj1);
            ConTest obj2 = new ConTest(52);
            System.out.println(obj2);
            ConTest obj3 = new ConTest(62,51);
            System.out.println(obj3);
    }
}