class Solution {
    public String solution(int n) {
        String answer = "";
        String[] a = {"수","박"};
       

        for (int i = 0 ;i < n ;i++){
            answer += a[i%2]; 
        } 
        return answer;
    }
}