class Data<T> {
    public void swap(T a , T b) {
        T t = a;
        a=b;
        b=t;
        System.out.println("A value "+a+ ", B value "+b);
    }
}

public class SwapDemo {
    public static void main(String[] args) {
        new Data().swap(12, 5);
        new Data().swap(12.7, 5.2);
        new Data().swap("Sahil", 15);
        new Data().swap(true, false);
    }
}