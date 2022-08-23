class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x/2;
        long ans = 0;
        if(x == 1) return 1;
        
        while(start <= end){
            long mid = (start + end) / 2;
            long sqrt = mid * mid;
            if(sqrt == x)
                return (int)mid;
            
            else if(x > sqrt){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return (int)ans;
    }
}