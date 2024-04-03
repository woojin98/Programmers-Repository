import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <2){
          return new int[]{-1};    
        }
        
            int[] answer = new int[arr.length-1];
            int min = Arrays.stream(arr).min().getAsInt();
            int a = 0;
                for(int num :arr){
                    if (num != min){
                        answer[a++] = num;      
                    }  
                }    

        
        return answer;
    }
}