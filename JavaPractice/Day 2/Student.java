public class Student{
    int sno;
    String firstName;
    String lastName;
    double cgp;

        @Override
        public final String toString(){
            return "Sno "+sno+" firstName "+firstName+" lastName "+lastName+" cgp "+cgp;
        }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.sno=1;s1.lastName="Matlani";s1.firstName="Sahil";s1.cgp=9.7;
        Student s2 = new Student();
        s2.sno=2;s2.lastName="Gupta";s2.firstName="Niru";s2.cgp=9.5;
        Student s3 = new Student();
        s3.sno=3;s3.lastName="Salve";s3.firstName="Nikita";s3.cgp=9.3;
        Student[] arr = new Student[]{s1,s2,s3};
        for(Student s : arr){
            System.out.println(s);
        }    
    }
}
