class Employ{
    int empno;
    String name;
    double basic;

    public Employ(int empno, String name, double basic){
        this.empno=empno;
        this.name=name;
        this.basic=basic;
    }

    @Override
    public final String toString(){
        return "Empno:"+empno+" Name:"+name+" Salary:"+basic;
    }
}
    class Karthiga extends Employ{
        public Karthiga(int empno,String name,double basic){
             super(empno,name,basic);
        }
       
    
    }

    public class SupDemo{
        public static void main(String[] args){
                Employ obj =new Karthiga(1,"Karthiga",62233);
                System.out.println(obj);
        }

    }