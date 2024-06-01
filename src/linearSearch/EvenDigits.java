package linearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int [] num = {12,345,2,6,7896};
        //System.out.println(findNumbers(num));
        System.out.println(evenDigits(0));
    }

    static int findNumbers(int [] nums){

        int count = 0;
        for(int num: nums){
            if (evenNum(num)){
                count++;
            }
        }

        return count;
    }

    static boolean evenNum(int num){
            int evenDigitNumbers = evenDigits(num);
        if (evenDigitNumbers % 2 ==0){
            return true;
        }
        return false;
    }

    static int evenDigits(int n){

        if (n < 0){
            n = n * -1;
        }

        if (n == 0){
            return 1;
        }
        int count = 0;

        while (n > 0){
            count++;
            n /= 10;
        }
        return count;
    }

}
