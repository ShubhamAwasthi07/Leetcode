class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;  // calculating the length of an array
        int count = 0;     // this variable is used to  store the counts of the valid triangle
        Arrays.sort(nums);   // sorting the Array
        for(int k = n-1 ; k > 1 ; k--){
            int i = 0;    // first pointer
            int j = k - 1;  // second pointer
            
            while(i < j){
                if((nums[i] + nums[j]) > nums[k]){
                    count = count + j - i;
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return count;
    }
}

// 2 2 3 4    nums[i] + nums[j] > nums[k]    count += j - i; 
// 0 1 2 3

// ^   ^ ^    int i = 0;
//             int j =  n-2   or j = k - 1 
//                 int k = n -1
    
    