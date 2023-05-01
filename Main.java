import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char [][] board = new char[N][M];

        for(int i=0; i< N; i++)
        {
            String str = br.readLine();
            for (int j=0;j< M; j++)
            {
                if(str.charAt(j)=='W')
                {
                    board[i][j] = 'W';
                }
                else{
                    board[i][j] = 'B';
                }
            }
        }
        int min = 64;

        for(int i = 0 ; i < N - 7 ; i++) { // 세로의 경우의 수
            for(int j = 0 ; j < M - 7 ; j++) { // 가로의 경우의 수
                min = Math.min(min, find(i, j, board)); // 최소값을 저장
            }
        }

        System.out.println(min);
    }


    public static int find(int x, int y, char arr[][]){
        int count = 0;
        char color = 'W';

        for(int i=x;i<x+8;i++){
            for(int j=y;j<y+8;j++){
                if(arr[i][j]!=color){
                    count++;
                }
                if(color=='W'){
                    color = 'B';
                }
                else{
                    color = 'W';
                }


            }
            if(color=='W')
            {
                color = 'B';
            }
            else{
                color = 'W';
            }
        }
        count = Math.min(count, 64-count);

        return count;
    }
}
