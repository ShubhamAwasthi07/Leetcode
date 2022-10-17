class Solution {
    public boolean checkIfPangram(String sentence) {
        
        HashSet<Character> set = new HashSet<>();
        for(char val : sentence.toCharArray()){

            set.add(val);
        }
        if(set.size() == 26){
            return true;
        }
        return false;
    }
}