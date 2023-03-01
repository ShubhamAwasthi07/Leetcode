class Solution {
    public int[] sortArray(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            return a - b;
        }); 
        
        for(int i = 0 ; i < n ; i++){
            pq.add(nums[i]);
        }
        int j = 0;
        while(pq.size() > 0){
            ans[j++] = pq.remove();
        }
        return ans;
    }
}