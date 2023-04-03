package backjoon.체스판다시칠하기;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] board = new char[n][m];
        for(int i=0; i<n; i++){
            board[i] = sc.nextLine().toCharArray();
        }
        int minChange =Integer.MAX_VALUE;
        // 탐색
        for(int i=0; i<=n-8;i++){
            for(int j=0; j<=m-8;j++){
                minChange = Math.min(minChange,countChange(i,j,board));
            }
        }
        System.out.println(minChange);
    }

    private static int countChange(int startX, int startY, char[][] board) {
        int change1=0;
        int change2=0;
        for(int i=startX;i<startX+8;i++){
            for(int j=startY; j<startY+8;j++){
                char c =( (i+j)%2==0) ? 'W' :'B';
                if(board[i][j] == c){
                    change2++;
                }else{
                    change1++;
                }
            }
        }
        return Math.min(change2,change1);
    }
}