public class BoxRun{

    public void show(Object ob){
        String s = ob.getClass().getSimpleName();
        System.out.println(s);
        if (s.equals("Integer")){
            System.out.println("Integer Casting");
            int x =(Integer)ob;
            System.out.println("x "+x);
        }
        else if (s.equals("Double")){
            System.out.println("Double Casting");
            Double y=(Double)ob;
            System.out.println("y "+y);
        }
        else if(s.equals("String")){
            System.out.println("String casting");
            String name = (String)ob;
            System.out.println("Name "+name);
        }
    }


    public static void main(String[] args){
        int x=12;
        double y=12.5;
        String name = "Bhaskar";
        BoxRun obj = new BoxRun();
        obj.show(x);
        obj.show(y);
        obj.show(name);
    }
}