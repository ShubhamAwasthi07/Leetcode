class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        int n = arr.length;
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        System.out.println(Arrays.toString(arr));
        System.out.println(diff);
        for(int i = 2 ; i < n ; i++){
             System.out.println(arr[i] - arr[i-1]);
            if(diff != arr[i] - arr[i-1]){
                return false;
            }
        }
        return true;
    }
}