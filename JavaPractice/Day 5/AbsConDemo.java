abstract class Employ{
    int empno;
    String name;
    double basic;

    public Employ(int empno, String name, double basic){
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }

    @Override
    public final String toString(){
        return "empno:"+empno+" Name:"+name+" Salary:"+basic;
    }
}

class Sahil extends Employ{
    public Sahil(int empno, String name, double basic){
        super(empno, name, basic);
    }
}

class Akash extends Employ{
    public Akash(int empno, String name, double basic){
        super(empno, name, basic);
    }
}

public class AbsConDemo{
    public static void main(String[] args){
        Employ[] arrEmploy = new Employ[]
        {
            new Sahil(1,"Sahil",56233),
            new Akash(3,"Akash",88111)
        };
        for (Employ e : arrEmploy){
            System.out.println(e);
        }
    }
}

