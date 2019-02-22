    class access
    {
       static int x;
       void increment()
       {
           x++;
       }   
     }   
    class static_use 
    {
        public static void main(String args[])
        {
            access obj1 = new access();
            access obj2 = new access();
            obj1.x = 0;   
            obj1.increment();
            System.out.println(obj1.x + " " + obj2.x);
            obj2.increment();
            System.out.println(obj1.x + " " + obj2.x);
            
         }
   }