class Data{
    public void sahil(){
        System.out.println("Hi I am Sahil....");
    }
    
    void nireesha() {
        System.out.println("Hi I am Nireesha.....");
    }

    private void omkar() {
        System.out.println("Hi I am Omkar...");
    }
    Data obj1=new Data();
        obj1.omkar();
}
    
public class Demo {
        public static void main(String[] args){
            Data obj=new Data();
                obj.sahil();
                obj.nireesha();
                // obj.omkar();
        }
}


