import java.util.Objects;

public class Employ{
    int empno;
    String name;
    double basic;

    @Override
    public final int hashCode(){
        return Objects.hash(empno, name, basic);
    }
    
    @Override
    public final String toString(){
        return "Empno " + empno+ " Name "+name+" Salary "+basic;
    }

    public static void main(String[] args){
       
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
        
        }
    }
