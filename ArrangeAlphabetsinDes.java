/*A string (with only alphabets) S is passed as input. The program should print the alphabets in the string in descending order. Assume all alphabets will be in lower case. 
Boundary Conditions: The length of string S is between 2 and 100. 
Example input and output: 
If the input is "cake", 
the output should be "keca" 
If the input is "innovation", 
the output should be "vtonia" (n or o or i should not be repeated)
 
 */
import java.util.*;
public class ArrangeAlphabetsinDes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        System.out.println(sb.reverse().toString());
        sc.close();
    }
}