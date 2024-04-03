import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        Arrays.sort(numbers);
        //nubers 와 a를 비교 
        for(int num1 : a){
            boolean found = false;
            for (int num2 : numbers){
                if(num1 == num2){
                    found = true;
                    break;   
                }
            }    
           if(!found){
               answer += num1;
           }
        }
        
        return answer;
    }
}
