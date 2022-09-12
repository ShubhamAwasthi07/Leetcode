class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start < end && mid <= end)
        {
            if(nums[mid]==0)
            {
                swap(nums, start, mid);
                mid++;
                start++;
            }
            else if(nums[mid]==2)
            {
                swap(nums, end, mid);
                end--;
            }
            else mid++;
        }
    }
    public static void swap(int []nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}