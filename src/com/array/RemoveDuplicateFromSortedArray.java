package com.array;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int nums[] = {2,2,3,3,4,6,6};

        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        int rd = removeDuplicate(nums);
        System.out.println();

        for (int i=0; i<rd; i++){
            System.out.print(nums[i] + " ");
        }

    }

    private static int removeDuplicate(int[] nums) {
        int rd = 0;

        for (int i=1; i<nums.length; i++){
            if (nums[rd] != nums[i]){
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd+1;
    }
}
