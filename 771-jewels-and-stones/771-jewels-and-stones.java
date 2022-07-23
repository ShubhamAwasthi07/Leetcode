class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        char[] ch1 = jewels.toCharArray();
        char[] ch2 = stones.toCharArray();
        int n = ch1.length;
        int m = ch2.length;
        int count = 0 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(ch1[i] == ch2[j]){
                    count++;
                }
            }
        }
        return count;
    }
}