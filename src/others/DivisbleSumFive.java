package others;

public class DivisbleSumFive {

    public static void main(String[] args) {
        int [] ar = {1,2,3,4,5,6};
        int target = 5;
        System.out.println(division(ar, target));
    }

    static int division(int []arr, int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]+arr[j]) % target == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
