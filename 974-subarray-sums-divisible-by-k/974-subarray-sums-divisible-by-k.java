class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int[] Rem = new int[k];
        for(int i = 0 ; i < k ; i++){
            Rem[i] = 0;
        }
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            int rem = ((sum % k) + k) % k;  
            Rem[rem]++;
        }
        int ans = 0;
        for(int i = 0 ; i < k ; i++){
            if(Rem[i] > 1){
                ans += (Rem[i] * (Rem[i] - 1)) / 2;
            }
        }
        ans += Rem[0];
        return ans;
    }
}