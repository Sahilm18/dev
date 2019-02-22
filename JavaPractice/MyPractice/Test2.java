class Test2 { 
    static int x = 10; 
public
    static void main(String[] args) 
    { 
        Test2 t1 = new Test2(); 
        Test2 t2 = new Test2(); 
  
        
        t1.x = 20; 
        System.out.println(t2.x); 
        System.out.print(t1.x + " "); 
        
    } 
} 