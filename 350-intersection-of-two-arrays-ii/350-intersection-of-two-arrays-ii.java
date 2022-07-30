class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
        }
        int s = ans.size();
        int[] res = new int[s];
        for(int k = 0 ; k < s; k++){
            res[k] = ans.get(k);
        }
        return res;
    }
}