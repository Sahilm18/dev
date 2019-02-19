public class Emp{
    private int empno;
    private String name;
    private double basic;

    public int getEmpno(){
        return empno;
    }

    public void setEmpno(int empno){
        this.empno=empno;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public double getBasic(){
        return basic;
    }

    public void setBasic(double basic){
        this.basic=basic;
    }

    @Override
    public final String toString(){
        return "Empno "+empno+" Name "+name+" Basic "+basic;
    }

    public static void main(String[] args){
        Emp obj = new Emp();
        obj.setEmpno(12);
        obj.setName("Priyanka");
        obj.setBasic(85377);
        System.out.println(obj);
    }
}