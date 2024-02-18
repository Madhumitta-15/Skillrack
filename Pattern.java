/*An odd length string S of length L is passed as the input.
The program must print the string S as two diagonals as shown in the example  Input/Output below.

Input Format:
The first line will contain S. Output Format: L lines will contain the pattern as shown in the example Input/Output below.

Boundary Conditions: 
Length of S is from 3 to 51.

Example Input/Output 1: 
Input: 
cry

Output:
c y
 r
c y

Example Input/Output 2:
Input:
tiger

Output:
t r
i e
 g
i e
t r */



import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] a = input.toCharArray();
        char[] b = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            if (i == 0 || i == a.length - 1) {
                b[i] = a[i];
            } else {
                b[i] = ' ';
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i == a.length / 2) {
                for (int j = 0; j < b.length; j++) {
                    if (j == a.length - i - 1) {
                        b[j] = a[j];
                    } else {
                        b[j] = ' ';
                    }
                }
                System.out.println(String.valueOf(b));
            } else {
                for (int j = 0; j < b.length; j++) {
                    if (j == a.length - i - 1 || j == i) {
                        b[j] = a[j];
                    } else {
                        b[j] = ' ';
                    }
                }
                System.out.println(String.valueOf(b));
            }
        }
        scanner.close();
    }
}