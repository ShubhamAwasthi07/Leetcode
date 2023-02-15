class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
    
        int n=num.length;
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<n||k!=0;i++){
            if(i<n) k+=num[n-i-1];
            list.add(0,k%10);
            k=k/10;
        }
        return list;
    }
}