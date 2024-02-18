
/*
 You are given a square matrix of size N×N. Calculate the sum of the integers present in the two main diagonals. 
 Input Format: The first line will contain the value of N. The next N lines will contain the N values separated by one or more spaces. 
 Output Format: The sum of the integers present in the two main diagonals. 
 Boundary Conditions: 2 <= N <= 20 
 Example Input/Output 1: 
 Input: 2 10 9 4 22 
 Output: 45 
 Explanation: The sum is = 10+22+9+4 = 45
 */
import java.util.*;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n - 1 - i];
        }
        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2];
        }

        System.out.print(sum);
        s.close();
    }
}
