package linearSearch;

public class Main {

    public static void main(String[] args) {
        int nums[] = {22,43,53,1,4,-1,23,3};
        int target = -7;
        System.out.println(linearSearch(nums, target));
    }

    /**
     * search in the array and return the index if the found
     * otherwise not found return -1
     */

    static int linearSearch(int[] arr, int target){
        // if array not found return -1;
        if (arr.length == 0){
            return -1;
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
    static boolean linearSearch1(int[] arr, int target){
        // if array not found return -1;
        if (arr.length == 0){
            return false;
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
