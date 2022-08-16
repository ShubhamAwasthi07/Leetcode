class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int j = 0;
        int k = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0){
                pos[j++] = nums[i];
            }else{
                neg[k++] = nums[i];
            }
        }
        int p = 0;
        int q = 0;
        int i = 0;
        while(i < n){
            ans[i++] = pos[p++];
            ans[i++] = neg[q++];
        }
        return ans;
    }
}