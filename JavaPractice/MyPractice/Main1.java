class Base {
    public void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public final void show() {
       System.out.println("Derived::show() called");
    }
}
  
class Main1 {
    public static void main(String[] args) {
        Derived d = new Derived();;
        d.show();
    }
}