import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 정상 출력
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));


        // 정상 출력
        int[][] arr = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution.solution(arr));


        // 이건 주소값 출력
        int[][] arr2 = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(arr2);

    }
}
