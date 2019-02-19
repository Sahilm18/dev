class Demo1 {
    public void show(){
        System.out.println("Show from Demo1");
    }
}

class Demo2 extends Demo1 {
    public void show(){
        // super.show();
        System.out.println("Show from Demo2");
    }
}

public class Sup1{

    public static void main(String[] args){
        Demo1 t = new Demo1();
        Demo1 obj1 = new Demo2();
        obj1.show();
        Demo2 obj2 = new Demo2();
        obj2.show();
        Demo1 obj3 = (Demo1) new Demo2();
        obj3.show();
        Demo1 x = (Demo1)t;
        x.show();
        // Demo2 y = (Demo1)x;
        // y.show(); bcz derived class can't have objects of base class but reverse is possible... and rightmost one holds the highest priority and the data...left side holds the reference

        
    }
}


