import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();

        int[] person1 = new int[answers.length];
        int[] person2 = new int[answers.length];
        int[] person3 = new int[answers.length];

        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        int correct1 = 0;
        int correct2 = 0;
        int correct3 = 0;

        // answers 정답과 비교할 수포자들 배열 만들어놓기.
        for (int i=0; i<answers.length; i++){
            // 수포자 1번 답 배열 만들어놓기 {1, 2, 3, 4, 5} 답 배열 크기가 5니까 5개 됐을 때 0으로 초기화
            person1[i] = answer1[cnt1];
            cnt1++;
            if (cnt1 == 5) cnt1 = 0;

            correct1 = answers[i] == person1[i] ? ++correct1 : correct1;

            // 수포자 2번 답 배열 만들어놓기 {2, 1, 2, 3, 2, 4, 2, 5} 답 배열 크기가 7니까 7개 됐을 때 0으로 초기화
            person2[i] = answer2[cnt2];
            cnt2++;
            if (cnt2 == 7) cnt2 = 0;

            correct2 = answers[i] == person2[i] ? ++correct2 : correct2;

            // 수포자 3번 답 배열 만들어놓기 {3, 3, 1, 1, 2, 2, 4, 4, 5, 5} 답 배열 크기가 9이니까 9개 됐을 때 0으로 초기화
            person3[i] = answer3[cnt3];
            cnt3++;
            if (cnt3 == 9) cnt3 = 0;

            correct3 = answers[i] == person3[i] ? ++correct3 : correct3;
        }

        int max = Math.max(correct1, Math.max(correct2, correct3));

        if (max == correct1) list.add(1);
        if (max == correct2) list.add(2);
        if (max == correct3) list.add(3);

        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;

    }
}