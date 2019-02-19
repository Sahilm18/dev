public class Cricket{
    static int score;
    public void incr(int x){
        score+=x;
    }

    public static void main(String[] args){
        Cricket fb = new Cricket();
        Cricket sb = new Cricket();
        Cricket ext = new Cricket();
        fb.incr(12);
        sb.incr(24);
        ext.incr(8);
        System.out.println("Total Score "+Cricket.score);
    }
}