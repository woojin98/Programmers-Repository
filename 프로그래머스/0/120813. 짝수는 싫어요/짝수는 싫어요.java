class Solution {
    public int[] solution(int n) {
        if(1<= n && n <= 100){
            int count = (n+1)/2;
            int[] answer = new int[count];

            for(int i = 0;i<count ;i++){
                
                answer [i] =2*i+1;
            
        }
        return answer;
    }else {
        return new int[0];
    }
    }
}