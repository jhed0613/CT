class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        for (int i=0; i<sizes.length; i++){
            if (sizes[i][1] > sizes[i][0]){
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }

        int xMax = sizes[0][0];
        int yMax = sizes[0][1];

        for (int i=1; i<sizes.length; i++){
            xMax = Math.max(xMax, sizes[i][0]);
            yMax = Math.max(yMax, sizes[i][1]);
        }

        answer = xMax * yMax;

        return answer;
    }
}