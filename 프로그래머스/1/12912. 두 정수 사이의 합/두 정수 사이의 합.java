class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        // a와 b가 같으면 그 값을 반환
        if (a == b) {
            return a;
        }

        // a와 b가 다르면 작은 값부터 큰 값까지의 합을 구함
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        for (int i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }
}
