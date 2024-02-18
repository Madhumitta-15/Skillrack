/*You are given a square matrix of size N×N. Calculate the absolute difference of the sums across the two main diagonals.

Input Format:
The first line will contain the value of N.
The next N lines will contain the N values separated by one or more spaces.

Output Format:
The absolute difference of the sums across the two main diagonals.

Boundary Conditions:
2 <= N <= 20

Example Input/Output 1:
Input:
2
10 9
4  22

Output:
19

Explanation:
The sum along the first diagonal is 10+22 = 32
The sum along the first diagonal is 4+9=13
The absolute difference is 32-13= 19

Example Input/Output 2:
Input:
2
-10 6
4  -22

Output:
22 */

import java.util.*;

public class AbsoluteDiffSumDia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] l = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                l[i][j] = s.nextInt();
            }
        }

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += l[i][i];
            sum2 += l[i][n - 1 - i];
        }

        if (sum1 < 0 && sum2 > 0) {
            System.out.println(Math.abs(sum1 + sum2));
        } else {
            System.out.println(Math.abs(sum1 - sum2));
        }
        s.close();
    }
}
