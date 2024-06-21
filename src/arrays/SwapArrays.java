package arrays;

public class SwapArrays {

    public int[] reverseArray(int[] arr){
        int len = arr.length - 1;
        for (int i=0; i<= len/2; i++){
            swap(arr, i, len-i);
        }
        return arr;
    }

    private static void swap(int []arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}


/*
AI: Sure!
You can create a function that takes in a number and returns its opposite.
Here's how you can do it:
*/


