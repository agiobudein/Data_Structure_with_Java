package linearSearch;

public class MaxWealthInt {

    static int maxWealth(int [][] arr){
        int answer = 0;
        for (int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }

            if (sum > answer){
                answer = sum;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
