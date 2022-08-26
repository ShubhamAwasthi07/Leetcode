class Solution {
    public boolean reorderedPowerOf2(int n) {
        int nMap[] = getCountMap(n);
        int i;
        for(i=0;i<30;i++){
            int map[] = getCountMap((int)Math.pow(2,i));
            if(Arrays.equals(nMap, map)){
                return true;
            }
        }
        
        return false;
    }
    
    private int[] getCountMap(int n){
        int map[] = new int[10];
        while(n>0){
            map[n%10]++;
            n = n/10;
        }
        
        return map;
    }
}