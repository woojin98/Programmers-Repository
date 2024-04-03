class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        // 마지막 4자리를 추출하여 answer에 추가
        answer += phone_number.substring(phone_number.length() - 4);
        
        return answer;
    }
}
