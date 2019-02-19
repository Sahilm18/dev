public class Demo1{
    public void show(int x){
        System.out.println("Show Method w.r.t int "+x );
    }

    public void show(double x){
        System.out.println("Show Method w.r.t Double "+x);
    }

    public void show(String x){
        System.out.println("Show Method w.r.t String "+x);
    }

    public void show(boolean x){
        System.out.println("Show Method w.r.t boolean "+x);
    }

    public static void main(String[] args){
        Demo1 obj1 = new Demo1();
        obj1.show(12);
        obj1.show(true);
        obj1.show(12.5);
        obj1.show("Sahil");
    }
    
}