class Solution {
    public int maxSumSubmatrix(int[][] M, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<M.length;i++){
             int[] arr=new int[M[i].length];
             for (int j = i; j < M.length; j++) {
                for (int col = 0; col < M[j].length; col++) {
                    arr[col] += M[j][col];
                }
                max=Math.max(max,subArraySum(arr,k));
            }
            
        }
        return max;
    }
     int subArraySum(int[] arr,int k) {
         int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum<=k)
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}