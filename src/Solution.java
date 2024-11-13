class Solution {
    public int[] solution(String[] park, String[] routes) {
        int startI = 0, startJ = 0;
        int rows = park.length;
        int cols = park[0].length();
        String[][] park2 = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                park2[i][j] = String.valueOf(park[i].charAt(j));
                if (park2[i][j].equals("S")) {
                    startI = i;
                    startJ = j;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] split = routes[i].split(" ");
            String direction = split[0];
            int move = Integer.parseInt(split[1]);

            int tempI = startI;
            int tempJ = startJ;
            boolean canMove = true;

            for (int j = 0; j < move; j++) {
                switch (direction) {
                    case "E":
                        tempJ++;
                        break;
                    case "W":
                        tempJ--;
                        break;
                    case "S":
                        tempI++;
                        break;
                    case "N":
                        tempI--;
                        break;
                }

                if (tempI < 0 || tempI >= rows || tempJ < 0 || tempJ >= cols) {
                    canMove = false;
                    break;
                }

                if (park2[tempI][tempJ].equals("X")) {
                    canMove = false;
                    break;
                }
            }
            if (canMove) {
                startI = tempI;
                startJ = tempJ;
            }
        }
        return new int[]{startI, startJ};
    }
}
