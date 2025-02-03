import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 연속된 정수 수열의 합을 찾는 함수
    public static void findSequence(int n, int l) {
        boolean found = false;
        int start = 0;
        int length = 0;

        // k는 l부터 가능한 최대 길이까지
        for (int k = l; k <= n; k++) { // k의 최대값을 n으로 설정
            // a = (n - k*(k-1)/2) / k
            // n과 k가 커질 수 있으므로, long으로 계산
            long numerator = (long)n - ((long)k * (k - 1)) / 2;

            if (numerator < 0) break; // a가 음수가 될 수 있지만, 문제의 조건에 따라 다를 수 있음

            if (numerator % k != 0) continue; // a가 정수가 아니면 무시

            start = (int)(numerator / k);
            length = k;
            found = true;
            break; // 가장 작은 k부터 탐색하므로, 첫 번째로 찾은 수열이 시작 정수가 가장 작은 수열
        }

        if (found) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(start + i).append(" ");
            }
            System.out.println(sb.toString().trim());
        } else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        findSequence(n, l);

    }
}
