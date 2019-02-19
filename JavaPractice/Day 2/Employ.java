import java.util.Objects;

public class Employ{
    int empno;
    String name;
    double basic;

    // @Override
    // public final boolean equals(Object ob) {
    //     Employ e = (Employ) ob; 
    //     if(e.basic == basic) {
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }

    @Override
    public final int hashCode(){
        return Objects.hash(empno, name, basic);
    }
    
    @Override
    public final String toString(){
        return "Empno " + empno+ " Name "+name+" Salary "+basic;
    }

    public static void main(String[] args){
        // Employ e1 = new Employ();
        // e1.empno=1;e1.name="Bhaskar";e1.basic=62333;
        // Employ e2 = new Employ();
        // e2.empno=2;e2.name="Leeza";e2.basic=66333;
        // Employ e3 = new Employ();
        // e3.empno=3;e3.name="Bhuvana";e3.basic=72333;
        // Employ[] arr = new Employ[]{e1,e2,e3};
        // for(Employ e : arr){
        //     System.out.println(e);

        Employ e1 = new Employ();
        Employ e2 = new Employ();

        e1.empno=1;e1.name="Sahil";e1.basic=57673;
        e2.empno=1;e2.name="Sahil";e2.basic=57673;

            System.out.println(e1);
            System.out.println(e2);
            System.out.println(e1.hashCode());
            System.out.println(e2.hashCode());
            System.out.println(System.identityHashCode(e1));
            System.out.println(System.identityHashCode(e2));



        //  Employ[] arr = new Employ[]{e1,e2};
        // for(Employ e : arr){
        //     System.out.println(e);
        // } 
        // System.out.println(e1==e2);
        // System.out.println(e1.equals(e2));    

            //System.out.println(e.empno + " " + e.name +" " + e.basic);
        }
    }
