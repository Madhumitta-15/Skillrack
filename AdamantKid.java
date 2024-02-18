/*An adamant kid keeps on repeating the stuff he wants. Like if the kid wants chocolate he keeps repeating "chocolate". Given the stuff the child is demanding the program must print if the character in two given positions X, Y is same or not by printing YES or NO. 

Input Format: First line will contain the name of the stuff as a string value S. Second line will contain two integer values X, Y denoting the position of the characters. The values of X and Y are separated by a space. 

Output Format: First line will contain YES or NO 

Boundary Conditions: Length of S is from 2 to 100. 

Sample Input/Output: Example 1: 
Input: 
icecream 
4 10 

Output: 
YES 

Explanation: As the kid keeps on repeating icecream, the 10th position character will also be c in icecreamicecream. As the characters in 4th and 10th position are same (that is c) the output is YES  */
import java.util.*;
public class AdamantKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int x1 = x - 1;
        int y1 = y - 1;

        if (x1 >= s.length())
            x1 = x1 % s.length();
        if (y1 >= s.length())
            y1 = y1 % s.length();

        if (s.charAt(x1) == s.charAt(y1))
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
