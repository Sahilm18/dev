public class Student{
    int sno;
    String firstName;
    String lastName;
    double cgp;

    public int getSno(){
        return sno;
    }

    public void setSno(int sno){
        this.sno=sno;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public double getCgp(){
        return cgp;
    }

    public void setCgp(double cgp){
        this.cgp=cgp;
    }

    @Override
    public final String toString(){
        return "sno="+sno+" firstName="+firstName+" lastName="+lastName+" cgp="+cgp;
    }

    public static void main(String[] args){
        Student obj = new Student();
        obj.setSno(1);
        obj.setFirstName("Sahil");
        obj.setLastName("Matlani");
        obj.setCgp(8.5);
        System.out.println(obj);
    }
}