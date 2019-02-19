public class Emp {
    int empno;
    String name;
    double basic;

    @Override 
    public final String toString() {
        return "Empno " +empno+ " Name " +name+ " Basic " +basic;
    }
}