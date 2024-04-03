import java.util.Arrays;

public class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        Arrays.fill(result, -1); // 결과 배열을 -1로 초기화
        
        // 각 문자가 등장한 마지막 위치를 저장하는 배열
        int[] lastSeenIndex = new int[26]; // 영어 소문자만 처리하기 때문에 26개의 알파벳에 대한 배열
        
        Arrays.fill(lastSeenIndex, -1); // 모든 문자의 마지막 등장 위치를 -1로 초기화
        
        // 문자열을 순회하면서 위치 찾기
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a'; // 알파벳의 인덱스 계산
            
            // 이전에 등장한 위치가 있으면 결과 배열 갱신
            if (lastSeenIndex[index] != -1) {
                result[i] = i - lastSeenIndex[index];
            }
            
            // 현재 위치 갱신
            lastSeenIndex[index] = i;
        }
        
        return result;
    }
}
