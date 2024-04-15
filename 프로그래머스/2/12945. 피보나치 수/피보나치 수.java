class Solution {
    public int solution(int n) {
        int answer = 0;
        // 0 1 1 2 3 5 8 13 21 
        
        int [] list = new int[n+1];
        list[0] = 0;
        list[1] = 1;
            
        for (int i = 2 ; i <= n ;i++){
            list[i] = (list[i-1]+ list[i-2]) %1234567;
        }
            answer = list[n] ;       
        
        return answer;
    }
}