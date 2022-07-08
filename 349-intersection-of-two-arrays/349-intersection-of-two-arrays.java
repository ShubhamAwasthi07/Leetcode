class Solution {
    public int[] getArrayList(List<Integer> arr){
        
        int n = arr.size();
        int[] marks = new int[n];
        for(int i = 0 ; i < n ; i++){
            marks[i] = arr.get(i);
        }
        return marks;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] countArr = new int[1001];
        
        for(int i = 0 ; i < n1 ; i++){
            countArr[nums1[i]]++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n2 ; i++){
            if(countArr[nums2[i]] > 0){
                ans.add(nums2[i]);
                countArr[nums2[i]] = 0;
                
            }
        }
        return getArrayList(ans);
    }
}