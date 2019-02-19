abstract class Training{
    abstract void name();
    abstract void email();
}

class Dhivya extends Training{
    @Override
    public void name(){
        System.out.println("Name is Dhivya...");
    }
    @Override
    public void email(){
        System.out.println("Email is dhivya@gmail.com");
    }
} 

class Priyanka extends Training{
    @Override
    public void name(){
        System.out.println("Name is Priyanka...");
    }
    @Override
    public void email(){
        System.out.println("Email is priyanka@gmail.com");
    }
} 

class Leeza extends Training{
    @Override
    public void name(){
        System.out.println("Name is Leeza...");
    }
    @Override
    public void email(){
        System.out.println("Email is leeza@gmail.com");
    }
} 
public class AbsDemo{

    public static void main(String[] args){
        Training[] arr = new Training[]
        {
            new Leeza(), new Dhivya(), new Priyanka()
        };
        for ( Training t : arr){
            t.name();
            t.email();
        }
    }
}
