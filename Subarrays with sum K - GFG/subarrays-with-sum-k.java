// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.findSubArraySum(Arr, N, k));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int findSubArraySum(int nums[], int n, int k)
    {
        // code here
        int[] prefix_sum = new int[n];
        prefix_sum[0] = nums[0];
        for(int i = 1; i < n ; i++){
            prefix_sum[i] = prefix_sum[i-1] + nums[i];
        }
        int count = 0;
        Map<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            if(hm.containsKey(prefix_sum[i] - k)){
                count += hm.get(prefix_sum[i] - k);
            }
            if(prefix_sum[i] == k) count++;
            
            hm.put(prefix_sum[i] , hm.getOrDefault(prefix_sum[i] , 0) + 1);
        }
        return count;
    }
    
}