public class LCS {
    public int[][] lcs (String a, String b){
        int m = a.length();
        int n = b.length();
        int[][] c = new int[m + 1][n + 1];

        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                if (a.charAt(i-1) == b.charAt(j-1))
                    c[i][j] = c[i-1][j-1] + 1;
                else
                    c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
            }
        }
        return c;
    }

    public String traceback(int i, int j, String a, String b, int[][] c){
        if (i==0 || j==0)
            return "";
        else if (a.charAt(i-1) == b.charAt(j-1))
            return traceback(i-1, j-1,a,b,c) + a.charAt(i-1);
        else
            if (c[i][j-1] >= c[i-1][j])
                return traceback(i, j-1, a,b,c);
            else
                return traceback(i-1, j, a,b,c);
    }
}
