interface IOne{
    default void display(){
        System.out.println("Display from IOne");
    }
}

interface ITwo{
    default void display(){
       System.out.println("Display from ITwo"); 
    }
}

interface IThree{
    default void display(){
        System.out.println("Display from IThree");
    }
}

class DemoTest implements IOne,ITwo,IThree{
    public void display(){
    IOne.super.display();
    ITwo.super.display();
    IThree.super.display();
    }
}

public class IntfEx{

    public static void main(String[] args){
        DemoTest obj = new DemoTest();
        obj.display();
    }
}
