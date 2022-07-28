class Solution {
    private int[][] convertIntoArray(List<List<Integer>> ans){
        int n = ans.size();
        int[][] arr = new int[n][2];
        
        for(int i = 0 ; i < n; i++){
            arr[i][0] = ans.get(i).get(0);
            arr[i][1] = ans.get(i).get(1);
            
        }
        return arr;
    }
    public int[][] merge(int[][] intervals) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(intervals , new Comparator<int[]>(){
            public int compare(int[] p1 , int[] p2){
                return p1[0] - p2[0];
            }
        }); 
        
        int n = intervals.length;
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int i = 1 ; i < n ; i++){
            int new_start = intervals[i][0];
            int new_end = intervals[i][1];
            
            if(new_start <= end){
                end = Math.max(end , new_end);
            }
            else{
                ans.add(Arrays.asList(start , end));
                start = new_start;
                end = new_end;
            }
        }
        ans.add(Arrays.asList(start , end));
        return convertIntoArray(ans);
    }
}