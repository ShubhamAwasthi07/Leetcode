class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int mask = 1;
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            num = num ^ mask;
            mask = mask << 1;
        }
        return num;
    }
}