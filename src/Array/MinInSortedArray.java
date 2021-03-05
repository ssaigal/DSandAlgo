package Array;

public class MinInSortedArray {
    public static int findMin(int[] nums) {

        int start =0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(nums[mid] > nums[end])
                start = mid+1;
            else
                end = mid;
        }

        return nums[start];

    }

    public static void main (String[] args)
    {
        int arr1[] =  {5, 6, 0,1, 2, 3, 4};
        int n1 = arr1.length;
        System.out.print("The minimum element is "+ findMin(arr1));

    }
}
