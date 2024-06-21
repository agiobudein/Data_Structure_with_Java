package bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {

    public List<Integer> findDuplicates(int[] nums) {
            int i = 0;

            while (i < nums.length){
                int current = nums[i] - 1;

                if (nums[i] != nums[current]){
                    swap(nums, i, current);
                }else {
                    i++;
                }
            }

            List<Integer> ans = new ArrayList<>();
            for (int j = 0; j < nums.length; j++){
                if (nums[j] != j + 1){
                    ans.add(nums[j]);
                }
            }
            return ans;
    }

    private static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
