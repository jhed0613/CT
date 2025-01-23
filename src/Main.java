import java.util.Scanner;

//        백준 9012, 괄호 문제
//        상근이는 문자열에 폭발 문자열을 심어 놓았다. 폭발 문자열이 폭발하면 그 문자는 문자열에서 사라지며, 남은 문자열은 합쳐지게 된다.
//        폭발은 다음과 같은 과정으로 진행된다.
//          * 문자열이 폭발 문자열을 포함하고 있는 경우에, 모든 폭발 문자열이 폭발하게 된다. 남은 문자열을 순서대로 이어 붙여 새로운 문자열을 만든다.
//          * 새로 생긴 문자열에 폭발 문자열이 포함되어 있을 수도 있다.
//          * 폭발은 폭발 문자열이 문자열에 없을 때까지 계속된다.
//        상근이는 모든 폭발이 끝난 후에 어떤 문자열이 남는지 구해보려고 한다. 남아있는 문자가 없는 경우가 있다. 이때는 "FRULA"를 출력한다.
//        폭발 문자열은 같은 문자를 두 개 이상 포함하지 않는다.

// 일단 변수 2개 입력 받고, 포문 내부 변수 값을 찾을 문자열 길이에서 - 폭탄 문자열 + 1 만큼. 즉, i<=찾을 문자열 길이 - 폭탄 문자열
// ex ) 찾을 문자열 = 김재형, 폭탄 문자열 = 김재
// 포문은 0번 부터 찾을 문자열 길이(3) - 폭탄 문자열(2) 만큼 빼는데 <= 이니까 사실상 -> 0, 1 까지 2번 도는데
// 내부 로직에서 i 인덱스 + ( i + ( 문자열 길이 -1 ) ) 만큼 더해서 폭탄을 찾음.
// 폭탄을 찾으면 포문 지역 변수에 split 으로 폭탄 만큼 자른 문자열을 합침
// ex ) strArr = strArr.split(0, 폭탄 문자열 시작 인덱스 - 1) + strArr.split(폭탄 문자열 시작 인덱스 + 폭탄 문자열 길이 - 1, strArr 총 길이)
// 여기서 strArr 변수는 계속 새로 바뀌는 값으로 초기화 되어야 하고, 초기 디폴트값은 초기 문자열이 들어와있어야함

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strArr = sc.nextLine();
        String c4 = sc.nextLine();

        for (int i=0; i<=strArr.length() - c4.length() + 1; i++){
            StringBuilder sb = new StringBuilder();
            if (strArr.charAt(i) == c4.charAt(0)){
                for (int j=0; j<c4.length(); j++){
                    int num = i;

                    sb.append(strArr.charAt(num + j));
                }

                // 문자열을 다 sb 변수에 넣었으면 이제 마지막에 c4 와 비교.
                if (c4.equals(sb.toString())){
                    String[] splitArr = strArr.split(c4);
                    strArr = "";
                    for (int k=0; k<splitArr.length; k++){
                        strArr += splitArr[k];
                    }
                }
            }
        }

        strArr = strArr.equals(c4) ? "FRULA" : strArr;
        System.out.println(strArr);
    }
}
