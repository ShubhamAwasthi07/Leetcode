public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
          int newN = 0;
        for(int i = 0; i < Integer.SIZE; i++) {
            newN = newN << 1;
            if((n & 1) > 0) {
                newN = newN ^ 1;
            }
            n = n >> 1;
        }
        return newN;
    }
}