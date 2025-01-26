import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strNum = br.readLine();
        int num = Integer.parseInt(strNum);

        int[][] triangle = new int[num][num];
        int[][] dp = new int[num][num];

        for (int i=0; i<num; i++){
            for (int j=0; j<=i; j++){
                int a = Integer.parseInt(br.readLine());
                triangle[i][j] = a;
                안녕ㅎㅅㅇ ㄱㅂ 열심히 해헤헤 이거 다 ㅁㅎㄹ ㅋㅋㅋ
                        이거 왜 띄어쓰기가 이래 별루다 ㅜ
                        들여쓰기 나도 알아 이자식아
                        암튼 아 좋은 말 쓸라햇는데 너가 그만 쓰라해서 안 쓴다 ㅃㅇ==
            }
        }
    }
}
