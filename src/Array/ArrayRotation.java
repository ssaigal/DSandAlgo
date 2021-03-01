package Array;

import java.util.Arrays;

//Write a function rotate(ar[], n) that rotates arr[] of size n by d elements.
public class ArrayRotation {

    public void leftRotate(int[] nums, int k) {
        if(nums.length <= 1) {
            return;
        }
        k = k % nums.length;
        int mid = nums.length - k;
        reverse(nums, mid, nums.length - 1);
        reverse(nums, 0, mid - 1);
        reverse(nums, 0, nums.length - 1);

        System.out.print(Arrays.toString(nums));

    }

    public void reverse(int[] nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }

    }

    public static void main(String[] args)
        {
            ArrayRotation rotate = new ArrayRotation();
            int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
            rotate.leftRotate(arr,3);
        }



}
