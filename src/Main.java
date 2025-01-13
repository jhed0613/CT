import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 풍선의 개수
        List<int[]> balloons = new ArrayList<>(); // 풍선 번호와 값 저장
        for (int i = 1; i <= n; i++) {
            balloons.add(new int[]{i, sc.nextInt()}); // {풍선 번호, 값}
        }

        List<Integer> result = new ArrayList<>(); // 터지는 순서를 저장할 리스트
        int idx = 0; // 시작 인덱스

        while (!balloons.isEmpty()) {
            int[] current = balloons.remove(idx); // 현재 풍선 제거
            result.add(current[0]); // 터진 풍선 번호 저장

            if (balloons.isEmpty()) {
                break; // 풍선이 없으면 종료
            }

            int move = current[1]; // 이동할 값

            // 다음 위치 계산
            if (move > 0) {
                idx = (idx + (move - 1)) % balloons.size(); // 오른쪽으로 이동
            } else {
                idx = (idx + move + balloons.size()) % balloons.size(); // 왼쪽으로 이동
            }

            // 인덱스가 음수일 경우 양수로 변환
            if (idx < 0) {
                idx += balloons.size();
            }
        }

        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
