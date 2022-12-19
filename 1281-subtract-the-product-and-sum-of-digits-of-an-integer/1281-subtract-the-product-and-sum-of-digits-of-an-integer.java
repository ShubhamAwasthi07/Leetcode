class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum = 0;
        int pro = 1;
        int rem = 0;
        while(n > 0){
            rem = n % 10;
            sum = sum + rem;
            pro = pro * rem;
            
            n = n / 10;
        }
        int diff = pro - sum;
        
        return diff;
    }
}