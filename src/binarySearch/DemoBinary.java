package binarySearch;

public class DemoBinary {

    static int binary(int []a, int key){
        int start = 0;
        int end = a.length - 1;
        int mid = 0;

        while (start <= end){
            mid = (start+end)/2;
            if (key == a[mid]){
                return mid;
            } else if (key < a[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {3,5,6,9,10,15,19,21,23,31};
        int key = 15;
        System.out.println(binary(a, key));
    }
}
