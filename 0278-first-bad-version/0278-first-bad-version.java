/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        long start = 1;
        long end = n;
        long result = n;
        
        while(start <= end){
            long mid = (start + end) / 2;
            
            if(isBadVersion((int)mid)){
                result = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return (int)result;
    }
}