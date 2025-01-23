import java.util.Scanner;

//        백준 9012, 괄호 문제
//        상근이는 문자열에 폭발 문자열을 심어 놓았다. 폭발 문자열이 폭발하면 그 문자는 문자열에서 사라지며, 남은 문자열은 합쳐지게 된다.
//        폭발은 다음과 같은 과정으로 진행된다.
//          * 문자열이 폭발 문자열을 포함하고 있는 경우에, 모든 폭발 문자열이 폭발하게 된다. 남은 문자열을 순서대로 이어 붙여 새로운 문자열을 만든다.
//          * 새로 생긴 문자열에 폭발 문자열이 포함되어 있을 수도 있다.
//          * 폭발은 폭발 문자열이 문자열에 없을 때까지 계속된다.
//        상근이는 모든 폭발이 끝난 후에 어떤 문자열이 남는지 구해보려고 한다. 남아있는 문자가 없는 경우가 있다. 이때는 "FRULA"를 출력한다.
//        폭발 문자열은 같은 문자를 두 개 이상 포함하지 않는다.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strArr = sc.nextLine();
        String c4 = sc.nextLine();
        sc.close();

        StringBuilder sb = new StringBuilder();
        int bombLength = c4.length();

        for (int i = 0; i < strArr.length(); i++) {
            sb.append(strArr.charAt(i));

            // 현재 sb의 길이가 폭발 문자열의 길이 이상일 때만 검사
            if (sb.length() >= bombLength) {
                boolean match = true;
                for (int j = 0; j < bombLength; j++) {
                    // 폭발 문자열과 일치하지 않으면 break
                    if (sb.charAt(sb.length() - bombLength + j) != c4.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                // 일치하면 폭발 문자열 부분 제거
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

