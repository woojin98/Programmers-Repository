class Solution {
    public long solution(long n) {
        long fail = -1;
        for(long x = 1; x * x <= n; x++) {
            if (n % x == 0 && n / x == x) {
                // n이 x의 제곱일 경우
                return (x + 1) * (x + 1);
            }
        }
        // n이 어떤 정수의 제곱이 아니라면 -1 반환
        return fail;
    }
}
