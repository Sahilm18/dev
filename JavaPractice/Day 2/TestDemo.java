public class TestDemo {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.empno=1;
        e1.name="Ram";
        e1.basic=98512.56;

        Emp e2 = new Emp();
        e2.empno=3;
        e2.name="Kalyan";
        e2.basic=88542;

        Stud s1 = new Stud();
        s1.sno=1;
        s1.name="Sahil";
        s1.cgp=8.5;

        Stud s2 = new Stud();
        s2.sno=3;
        s2.name="Kalpana";
        s2.cgp=8.2;

        Emp[] arrEmp = new Emp[]{e1, e2};
        Stud[] arrStud = new Stud[]{s1, s2}; 

        for(Student s : arrEmp) {
            System.out.println(s);
        }
    }
}