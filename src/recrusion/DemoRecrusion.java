package recrusion;

public class DemoRecrusion {

    static void func(int n){
        if (n < 1){
            return;
        }
        System.out.println(n);
        func(n - 1);
    }
    public static void main(String[] args) {
        func(3);
    }
}
