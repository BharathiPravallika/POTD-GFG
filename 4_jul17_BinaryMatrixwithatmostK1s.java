class Solution{
    static ArrayList<Integer> largestSquare(ArrayList<ArrayList<Integer>> M, int R, int C, int K, int Q, int[] q_i, int[] q_j){
        ArrayList<Integer>res=new ArrayList<>();
        int[][] dp = new int[R+1][C+1];
        for(int i=1; i<=R; i++){
            for(int j=1; j<=C; j++){
                dp[i][j] = M.get(i-1).get(j-1)+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
            }
        }
        for(int q=0; q<Q; q++){
            int i = q_i[q];
            int j = q_j[q];
            int d = Math.min(Math.min(i, j), Math.min(R-i-1, C-j-1));
            int ans = 0;
            int l = 0;
            int h=d;
            while(l<=h){
                int m = (l+h)/2;
                int x1 = i-m;
                int y1 = j-m;
                int x2 = i+m;
                int y2 = j+m;
                int count = dp[x2+1][y2+1]-dp[x1][y2+1]-dp[x2+1][y1]+dp[x1][y1];
                if(count <= K){
                    ans = 2*m+1;
                    l = m+1;
                }
                else{
                    h=m-1;
                }
            }
            res.add(ans);
        }
        return res;
    }
}
