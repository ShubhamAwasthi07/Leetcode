class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int i = 0, j = n-1 ;
        while (colors[j] == colors[0]) j-- ;
        while (colors[i] == colors[n-1]) i++ ;
        return Math.max(j, n-i-1) ;
    }
}