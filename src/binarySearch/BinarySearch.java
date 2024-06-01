package binarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int [] arr = {3,5,6,8,12,15,16,19,21};
        int key = 12;
        System.out.println(binarySearch(arr, key));
    }

    static int binarySearch(int [] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end){

            mid = start + (end - start)/2;

            if (target == arr[mid]){
                return mid;
            }else if (target > arr[mid]){
                start = mid +1;
                end = end;
            }else {
                end = mid - 1;
                start = start;
            }
        }
        return -1;
    }
}
