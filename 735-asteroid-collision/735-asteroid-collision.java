class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        
        int i = 0;
        while(i < n){
            int current = asteroids[i];
            
            if(st.isEmpty()){
                st.push(current);
                i++;
            }
            else{
                
                int last = st.peek();
                if(last > 0 && current < 0){
                    if(Math.abs(current) <= last) i++;
                    if(Math.abs(current) >= last) st.pop();
                }
                else{
                    // If there is no collision
                    st.push(current);
                    i++;
                }
            }
        }
        
        int[] res = new int[st.size()];
        for(int j = st.size() - 1 ; j >= 0 ; j--){
            res[j] = st.pop();
        }
        return res;
    }
}