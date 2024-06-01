package linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {18, 12, -7, 3, 14, 28};
        int target = 14;
        System.out.println(linearSearch(arr, target, 1,4));
    }
    /*
    * Search for 3 in the range of index [1,4]
    *
    * */

    static int linearSearch(int []arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        for(int i=start; i<end; i++){
            if (arr[i] == target){
                return arr[i];
            }
        }
        return -1;
    }
}
