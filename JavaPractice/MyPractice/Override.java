class Bank{  
    static int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends Bank{  
static int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
static int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
static int getRateOfInterest(){return 9;}  
}  
//Test class to create objects and call the methods  
class Override{  
public static void main(){  
Bank s=new SBI();  
Bank i=new ICICI();  
Bank a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
}  