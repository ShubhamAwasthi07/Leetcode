//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String args[]) throws IOException {
		BufferedReader read =
		new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(read.readLine());
			String S[] = read.readLine().split(" ");
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(S[i]);
			int k = Integer.parseInt(read.readLine());

			Solution ob = new Solution();
			System.out.println(ob.countPairs(n, arr, k));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
	static long countPairs(int n, int[] arr, int k) {
		// code here
		Map<Integer , Integer> hm = new HashMap<>();
		long count = 0;
		
		for(int i = 0 ; i < n ; i++){
		    if(hm.containsKey(arr[i] % k)){
		        count += hm.get(arr[i] % k);
		    }
		    
		    hm.put(arr[i]%k , hm.getOrDefault(arr[i]%k , 0) + 1);
		}
		
		return count;
	}
}