class Solution {
    public int[] createTargetArray(int[] nums, int[] index){
        int[] targetArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(targetArr[i] == 0){
            int i1 = i;
        while(i1 != index[i]){
            targetArr[i1] = targetArr[i1 - 1];
            i1--;
        }
    }
        targetArr[index[i]] = nums[i];
  }
        return targetArr;
        }
}