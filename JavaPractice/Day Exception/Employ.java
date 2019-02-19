public class Employ {
    int empno;
    String name;
    double basic;

    public Employ() {

    }

    public Employ(int empno, String name, double basic) {
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }

    @Override
    public final String toString() {
        return "Empno "+empno+" Name "+name+" Basic "+basic;
    }
}

