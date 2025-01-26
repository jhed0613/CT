import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strNum = br.readLine();
        int num = Integer.parseInt(strNum);

        int[][] triangle = new int[num][num];
        int[][] dp = new int[triangle.length][triangle.length];

        // 입력으로 주어지는 삼각형 먼저 만들기
        for (int i=0; i<num; i++){
            String strInput = br.readLine();
            String[] split = strInput.split(" ");
            for (int j=0; j<=i; j++){
                int input = Integer.parseInt(split[j]);
                triangle[i][j] = input;
                dp[i][j] = 0;
            }
        }

        // 포문은 1부터 시작 그 안의 2중 내부 <=i 로 선언하여 굳이 뒤의 0값을 순회하지 않게 했음.
        // 만약 2번째 줄이라고하면 1 인덱스부터 j 값까지 총 1, 2를 조회하면 됨. ( 더 효율적 )
        // 제로패딩은 안했고 초기 dp[0][0] 값을 triangle[0][0] 으로 초기화를 먼저 시켜주고 계산을 진행했음.
        // 구현은 j 가 0일떄는 삼각형의 가장 왼쪽이기 때문에 대각선 왼쪽이 존재하지 않음. 따라서, dp[i-1][j] + triangle[i][j] 로 바로 위의 값과 더해줌
        // j==i 일 때. 즉, 가장 오른쪽 일 떄를 두번째 else if 로 먼저 빼줬음. 먼저 뺴준 이유는 그 다음 나와야할 j가 가장 왼쪽도 오른쪽도 아닐 때 인 상황을
        // 따로 빼주는 게 코드가 지저분해서 얘를 먼저 뻇음. j==i 일 떄는 바로 위의 값이 없기 때문에 dp[i-1][j-1] + triangle[i][j]를 해주어 계산
        // else. 즉, 가장 왼쪽도 오른쪽도 아닌 중간일 때는 대각선 왼쪽과의 합 vs 바로 위 값과의 합 중 더 큰 것을 찾음.
        // dp[i-1][j-1] 와 dp[i-1][j] 의 값 중 Max 값을 찾아 저장함.
        // 마지막으로 i 가 dp.length -1 이 되면. 즉, dp.length 는 0인덱스부터 dp.length -1 인덱스까지 존재하기에 마지막 줄이 되면 그 라인에서 최대값이
        // 우리가 원하는 최대값이기에 거기를 순회하여 값을 리턴함.
        dp[0][0] = triangle[0][0];
        for (int i=1; i<dp.length; i++){
            for (int j=0; j<=i; j++){
                if (j==0)
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                else if (j==i)
                    dp[i][j] = dp[i-1][j-1] + triangle[i][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j-1] + triangle[i][j], dp[i-1][j] + triangle[i][j]);


            }
        }

        // 삼각형의 마지막 행에서 최대 값 찾기
        // 결과 출력하는 부분은 포문 따로 뺴서해야함 위에서 하면 삼각형 길이가 1일때 테스트케이스 오류남.
        int answer = dp[num - 1][0];
        for (int j = 1; j < num; j++) {
            if (dp[num - 1][j] > answer) {
                answer = dp[num - 1][j];
            }
        }

        // 결과 출력
        System.out.println(answer);
    }
}
