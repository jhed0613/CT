import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strNum = br.readLine();
        int num = Integer.parseInt(strNum);

        String strNums = br.readLine();
        String[] strNumList = strNums.split(" ");


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i=0; i<num; i++){
            int numList = Integer.parseInt(strNumList[i]);
            max = numList > max ? numList : max;
            min = numList < min ? numList : min;
        }
        System.out.println(min + " " + max);
    }
}
