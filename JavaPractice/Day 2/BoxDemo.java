public class BoxDemo{
    public static void main(String[] args){
        int x=12;
        double y=12.5;
        String name="Kalpana";

        Object obj1 = x;
        Object obj2 = y;
        Object obj3 = name;

   
        int x1 = (Integer)obj1;
        System.out.println(++x1);
        Double y1 = (Double) obj2;
        System.out.println(y1);
        String s1 = (String) obj3;
        System.out.println(s1);
    }
}