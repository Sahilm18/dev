class First{
    public int sum(){
        return 5;
    }

    public void show(){
        System.out.println("Show from class first..");
    }
}

class Second extends First{

    public int sum(){
        return 6;
    }
    public void display(){
        System.out.println("Display from class second..");
    }
}

public class Inh{

    public static void main(String[] args){
        Second obj = new Second();
        obj.show();
        obj.display();
        System.out.println(obj.sum());

        
    }
}