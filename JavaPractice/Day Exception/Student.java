public class Student {
    int sno;
    String name;
    String city;
    double cgp;

    public Student() {

    }

    public Student(int sno, String name, double cgp, String city) {
        this.sno = sno;
        this.name = name;
        this.cgp = cgp;
        this.city = city;
    }
    @Override
    public final String toString() {
        return "Sno "+sno+" Name "+name+" cgp "+cgp+" city "+city;
    }

    public static void main(String[] args) {
        
    }
}