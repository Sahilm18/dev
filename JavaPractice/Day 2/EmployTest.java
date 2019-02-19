public class EmployTest{
    int empno;
    String name;
    double basic;
  

    @Override
    public final String toString(){
        return "Empno " + empno+ " Name "+name+" Salary "+basic+ "Sno "+sno;
        
    }

    public static void main(String[] args){
        Employ e1 = new Employ();
        e1.empno=1;e1.name="Bhaskar";e1.basic=62333;
        Employ e2 = new Employ();
        e2.empno=2;e2.name="Leeza";e2.basic=66333;
        Employ e3 = new Employ();
        e3.empno=3;e3.name="Bhuvana";e3.basic=72333;
        Employ[] arr = new Employ[]{e1,e2,e3};
        for(Employ e : arr){
            System.out.println(e);

         Student s1 = new Student();
        s1.sno=1;s1.lastName="Matlani";s1.firstName="Sahil";s1.cgp=9.7;
        s2.sno=2;s2.lastName="Gupta";s2.firstName="Niru";s2.cgp=9.5;
        Student s3 = new Student();
        Student[] arr1 = new Student[]{s1,s2};
        for(Student s : arr1){
            System.out.println(s);    



            //System.out.println(e.empno + " " + e.name +" " + e.basic);
        }
    }
}