import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int min = Integer.MAX_VALUE;
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cardCnt = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cardList = new int[cardCnt];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i=0; i<cardCnt; i++){
            cardList[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i=0; i<cardCnt; i++){
            for (int j=i+1; j<cardCnt; j++){
                for (int k=j+1; k<cardCnt; k++){
                    int sum = cardList[i] + cardList[j] + cardList[k];
                    int a = m - sum;

                    if (a >= 0 && a < min && sum <= m) {
                        min = a;
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
