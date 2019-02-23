class A 
    {
        int i;
        void display() 
        {
            System.out.println(i);
        }
    }    
    class B extends A 
    {
        int j=3;
        void display() 
        {
            System.out.println(j);
        }
    }    
    class inheritance_demo 
    {
        public static void main(String args[])
        {
            A obj = new B();
            obj.i=1;
            obj.display();     
        }
   }