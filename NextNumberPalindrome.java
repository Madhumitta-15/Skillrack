
/*An integer N is passed as input. The program must print the immediate next palindromic number of N.

Boundary Condition(s):
1 <= N <= 999999999

Input Format:
The first line contains N.

Output Format:
The first line contains the immediate next palindromic number of N.

Example Input/Output 1:989989

Input:
119

Output:
121

Example Input/Output 2:
Input:
1111

Output:
1221 */
import java.util.*;

public class NextNumberPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n++;
        for (;; n++) {
            if (String.valueOf(n).equals(new StringBuilder(String.valueOf(n)).reverse().toString())) {
                System.out.print(n);
                break;
            }
        }
        s.close();
    }
}
