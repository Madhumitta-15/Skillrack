/*
 A MxN mat is passed as the input. 
 The program must rotate the mat by 90 degrees in anti-clock wise direction and print the rotated mat as the output. 
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
 9 5 
 5 3 
 4 1
 */

import java.util.*;

public class Rotate90degAnticlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[][] res = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = mat[m - 1 - j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
