class Solution {
    boolean solution(String s) {
        s= s.toLowerCase();
        boolean answer = true;
        int count1 = 0;
        int count2 = 0;
        for(int i= 0 ; i<s.length();i++){
            if(s.charAt(i) == 'p') count1++;
            if(s.charAt(i) == 'y') count2++;
            
            
        }
        if(count1 == count2){
            return answer;
        }else {
            return !answer;
        }
            

            
        }
    }
