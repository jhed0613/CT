import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 조합을 계산하는 함수
    public static long combination(int m, int n) {
        if(n > m - n) n = m - n; // C(m,n) == C(m, m-n)
        long result = 1;
        for(int i = 1; i <= n; i++) {
            result = result * (m - n + i) / i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String t = br.readLine();
        int testCase = Integer.parseInt(t.trim());

        for (int i = 0; i < testCase; i++) {
            String a = br.readLine();
            String[] split = a.trim().split("\\s+");

            int n = Integer.parseInt(split[0]);
            int m = Integer.parseInt(split[1]);

            long answer = combination(m, n);
            System.out.println(answer);
        }
    }
}
