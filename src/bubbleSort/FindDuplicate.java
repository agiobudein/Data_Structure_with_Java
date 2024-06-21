package bubbleSort;

public class FindDuplicate {

    public int findDuplicate(int[] arr){
        int i = 0;

        while (i < arr.length){
            int current = arr[i] - 1;

            if (arr[i] != i + 1){
                if (arr[i] != arr[current]){
                    swap(arr, i, current);
                }else {
                    return arr[i];
                }
            }else {
                i++;
            }

        }
        return -1;
    }

    static void swap(int[]a, int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
