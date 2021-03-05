package Array;

public class SearchInSortedArray {

    public int search(int[] nums, int target) {

        int low = findStart(nums);
        int end = nums.length-1;
        int start = low;
        if(target > nums[end])
        {
            start=0;
            end = low-1;
        }

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid - 1;
            else
                start = mid+1;
        }

        return -1;


    }


    public int findStart(int nums[]){

        int start =0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(nums[mid] > nums[end])
                start = mid+1;

            else
                end = mid;
        }

        return start;


    }

    public static void main(String args[])
    {
        SearchInSortedArray sa = new SearchInSortedArray();
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int n = arr.length;
        int key = 6;
        int i = sa.search(arr, key);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");
    }

}
