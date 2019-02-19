public class Customer{
    int custId;
    String cName;
    Double billAmt;

    @Override
    public final String toString(){
        return "Cust ID " +custId+ " Name "+cName+" cName "+cName+" Cost "+billAmt; 
    }

    public void show(Object ob){
        Customer c1 = (Customer)ob;
        System.out.println(c1);
    }


    public static void main(String[] args){
        Customer c1 = new Customer();
        c1.custId=1;
        c1.cName="Sahil";
        c1.billAmt= 12345.12;
        c1.show(c1);
    }
}