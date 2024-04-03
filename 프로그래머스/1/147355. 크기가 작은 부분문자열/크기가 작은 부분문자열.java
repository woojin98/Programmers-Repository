public class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int tLength = t.length();
        int pLength = p.length();
        
        // 부분 문자열을 순회하면서 비교
        for (int i = 0; i <= tLength - pLength; i++) {
            String subStr = t.substring(i, i + pLength);
            if (compare(subStr, p) <= 0) {
                count++;
            }
        }
        
        return count;
    }
    
    // 문자열을 비교하는 함수
    private int compare(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                return 1;
            }
        }
        return 0;
    }
}
