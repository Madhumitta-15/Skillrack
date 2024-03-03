
/*Smaller Matrix Search [ZOHO]

A bigger NxN matrix is passed as the input. Also a smaller MxM matrix is passed as input.
 The program must print TRUE if the smaller matrix can be found in the bigger matrix.
 Else the program must print FALSE.

Input Format:

First line will contain the value of N.
Second line will contain the value of M.
Next N lines will contain the values in the N*N matrix with each value separated by one or more space.
Next M lines will contain the values in the M*M matrix with each value separated by one or more space.

Output Format:

First line will contain the string value TRUE or FALSE

Boundary Conditions:
3 <= N <= 202 <= M <= N

Example Input/Output 1:

Input:
3
2
4 5 9
1 3 5
8 2 4
3 5
2 4

Output:
TRUE */
import java.util.*;

public class SmallerMatrixSearch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[][] bigMatrix = new int[N][N];
        int[][] smallMatrix = new int[M][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bigMatrix[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                smallMatrix[i][j] = s.nextInt();
            }
        }

        boolean found = false;
        outerloop: for (int i = 0; i <= N - M; i++) {
            for (int j = 0; j <= N - M; j++) {
                boolean match = true;
                for (int k = 0; k < M; k++) {
                    for (int l = 0; l < M; l++) {
                        if (bigMatrix[i + k][j + l] != smallMatrix[k][l]) {
                            match = false;
                            break;
                        }
                    }
                    if (!match) {
                        break;
                    }
                }
                if (match) {
                    found = true;
                    break outerloop;
                }
            }
        }

        System.out.println(found ? "TRUE" : "FALSE");
        s.close();
    }
}
