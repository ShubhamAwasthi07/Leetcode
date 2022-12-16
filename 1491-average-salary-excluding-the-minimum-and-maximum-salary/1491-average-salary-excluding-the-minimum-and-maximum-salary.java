class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        Arrays.sort(salary);
        double sum = 0;
        double count = 0;
        for(int i = 1 ; i < n - 1 ; i++){
            sum = sum + salary[i];
            count++;
            // System.out.println(sum);
        }
        // System.out.print(sum);
        double avg = (sum) /count ;
        
        return avg;
    }
}