
/*download
Two string values S1 and S2 are passed as input. The program must check if both S1 and S2 contain the same unique set of letters and print YES or NO. Assume all the letters (alphabets) are in smaller case. 

Boundary Conditions: Length of S1 is from 2 to 100 Length of S2 is from 2 to 100

Input Format: First line will contain the string value of S1 Second line will contain the string value of S2 

Output Format: YES or NO depending on if both S1 and S2 contain the same set of unique letters. IMPORTANT: Please not that the output is CASE SENSITIVE. Hence print YES or NO (instead of yes or no) 

Sample Input/Output: 
Example 1: Input: 
read dear 

Output: 
YES 

Explanation: Both S1 and S2 are formed using the letters - a d e r */
import java.util.*;

public class StringLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().trim();
        String s2 = s.nextLine().trim();
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for (char c : a1) {
            set1.add(c);
        }
        for (char c : a2) {
            set2.add(c);
        }
        if (set1.equals(set2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        s.close();
    }
}
