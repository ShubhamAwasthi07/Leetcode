class Solution {
    public int isHappyNumber(int n){
        int sum = 0;
        int rem = 0;
        while(n > 0){
            rem = n % 10;
            sum = sum + (rem*rem);
            n = n / 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int result = n;
       while(result != 1 && result != 4){
          result = isHappyNumber(result);  
       }  
    
        if(result == 1) return true;
         return false;
    }
}