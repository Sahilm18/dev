class NegativeException extends Exception {
    NegativeException(String error) {
        super(error);
    }
}

class NumberZeroException extends Exception {
    NumberZeroException(String error) {
        super(error);
    }
}

public class Custom {
    public void sum(int a, int b) throws NumberZeroException,NegativeException {
        boolean flag = true;
        if (a < 0 || b < 0) {
            flag = false;
            throw new NegativeException("Negative nos not allowed");
        }

        if (a==0 || b==0){
            flag = false;
            throw new NumberZeroException("Zero is invalid value");
        }

        if (flag=true) {
            int c = a + b;
            System.out.println("Sum is " + c);
        }
    }

    public static void main(String[] args) {
        Custom obj = null;
        try {
            new Custom().sum(-1,0);
        } catch (NegativeException | NumberZeroException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Object Memory not allowed..");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}