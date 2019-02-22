class Outer { 
     private String msg = "GeeksforGeeks"; 
     private void fun() { 
          System.out.println("Outer fun()"); 
     } 

  
     class Inner extends Outer { 
         private void fun()  { 
               System.out.println("Accessing Private Member of Outer: " + msg); 
         } 
     } 

     
  
     public static void main(String args[])  { 
  
          // In order to create instance of Inner class, we need an Outer  
          // class instance. So, first create Outer class instance and then 
          // inner class instance. 
          Outer o = new Outer(); 
          Inner  i = o.new Inner(); 
            
          // This will call Inner's fun, the purpose of this call is to  
          // show that private members of Outer can be accessed in Inner. 
          i.fun();   
  
          // o.fun() calls Outer's fun (No run-time polymorphism). 
          o = i;  
          o.fun(); 
     } 
} 