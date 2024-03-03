/*A MxN mat is passed as the input. 
The program must rotate the mat by 90 degrees in clock wise direction and print the rotated mat as the output. 
Input Format: First line will contain the value of M. Second line will contain the value of N. Next M lines will contain the N values with each value separated by one or more space. 
Output Format: N lines will contain the M values with each value separated by one or more space. 
Boundary Conditions: 2 <= M <= 15 
2 <= N <= 15 
Example Input/Output 1: 
Input: 
2 
3 
4 5 9 
1 3 5 
Output: 
 1 4
 3 5 
 5 9 */

import java.util.*;

public class Rotate90degClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] mat = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[][] res = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                res[i][j] = mat[M - 1 - j][i];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
