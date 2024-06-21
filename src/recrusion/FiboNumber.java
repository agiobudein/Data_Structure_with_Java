package recrusion;

public class FiboNumber {

    public static void main(String[] args) {
        System.out.println(fibo(20));
    }

    static int  fibo(int n){
        // base condition

        if (n < 2){
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

}
