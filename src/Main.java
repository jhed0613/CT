import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        int[] arr = {1, 3, 2, 4, 2};
        int[] s = solution.solution(arr);
        System.out.println(s);
    }
}
