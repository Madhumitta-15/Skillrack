/*Given a string S and two characters A, B the program must print the number of occurrences where A is followed by B.

Boundary Conditions:
Length of the string S is between 2 and 200.

Input Format:
First line will contain the string value S.
Second line will contain the value of A.
Third line will contain the value of B.

Output Format:
First line will contain the integer which represents the number of occurrences in sring S where A is followed by B
 

Sample Input/Output:

Example 1:
Input:
malayalam
a
l

Output:
2 */

import java.util.*;

public class CharacterBfollowsA {
    public static void main(String args[])

    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char c = in.next().charAt(0);
        char c1 = in.next().charAt(0);
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == c && ch[i + 1] == c1) {
                count++;
            }
        }
        System.out.println(count);
        in.close();

    }
}
