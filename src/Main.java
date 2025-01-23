//        백준 9012, 괄호 문제
//        상근이는 문자열에 폭발 문자열을 심어 놓았다. 폭발 문자열이 폭발하면 그 문자는 문자열에서 사라지며, 남은 문자열은 합쳐지게 된다.
//        폭발은 다음과 같은 과정으로 진행된다.
//          * 문자열이 폭발 문자열을 포함하고 있는 경우에, 모든 폭발 문자열이 폭발하게 된다. 남은 문자열을 순서대로 이어 붙여 새로운 문자열을 만든다.
//          * 새로 생긴 문자열에 폭발 문자열이 포함되어 있을 수도 있다.
//          * 폭발은 폭발 문자열이 문자열에 없을 때까지 계속된다.
//        상근이는 모든 폭발이 끝난 후에 어떤 문자열이 남는지 구해보려고 한다. 남아있는 문자가 없는 경우가 있다. 이때는 "FRULA"를 출력한다.
//        폭발 문자열은 같은 문자를 두 개 이상 포함하지 않는다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 받습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strArr = br.readLine();
        String c4 = br.readLine();
        br.close();

        StringBuilder sb = new StringBuilder();
        int bombLength = c4.length();
        char lastChar = c4.charAt(bombLength - 1); // 폭발 문자열의 마지막 문자

        for (int i = 0; i < strArr.length(); i++) {
            char currentChar = strArr.charAt(i);
            sb.append(currentChar);

            // 현재 문자가 폭발 문자열의 마지막 문자와 일치할 때만 검사
            if (currentChar == lastChar && sb.length() >= bombLength) {
                boolean match = true;
                for (int j = 0; j < bombLength; j++) {
                    if (sb.charAt(sb.length() - bombLength + j) != c4.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    sb.setLength(sb.length() - bombLength);
                }
            }
        }

        // 결과 출력
        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb.toString());
        }
    }
}
