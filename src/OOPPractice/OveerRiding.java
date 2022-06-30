package OOPPractice;

public class OveerRiding {

    private  int x;
    private int y;

    public OveerRiding() {
    }

    public OveerRiding(int x) {
        this(); //chaining method
        this.x = x;
    }

    public OveerRiding(int x, int y) {
        this(2); // this.x.=x (chaining method)
        this.y = y;
    }



    public void sum(int a , int b){
        System.out.println(a+b);
    }

    public void sum(int c , int d, int e){
        System.out.println(c+d+e);
    }
}
