import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String t = br.readLine();

        int testCase = Integer.parseInt(t);

        for (int i=0; i<testCase; i++){
            String a = br.readLine();
            String[] split = a.split(" ");

            int n = Integer.parseInt(split[0]);
            int m = Integer.parseInt(split[1]);

            long totalN = 0;
            long totalM = 0;
            long answer = 0;

            int size = n;
            int cSize = 1;

            for (int j=0; j<size; j++){
                totalN += cSize++;
                totalM += m--;
            }
            answer = totalM / totalN;
            System.out.println(answer);
        }
    }
}
