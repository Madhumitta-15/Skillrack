
/*
Sharon does not like vowels.
So she wants to remove vowels from any string.
But her friend Jennie loves vowels and wants to retain vowels in as string.
So both discuss and agree to the following condition.-
They will reverse the string value and then remove the letters
in the positions of the vowels in the original string.
Help them by writing the program implementing the above condition.
Input Format:
First line will contain the string value S.Output Format:First line will contain the reversed string
value with the letters in the positions of vowels in the original string removed.Constraints:Length of String S is from 2 to 50.
Sample Input/Output:
Example 1:Input:
environment
Output:
nenrine
Explanation:
The reversed string value is tnemnorivne.
The vowels position in the original string are e-1 i-4 o-6 e-9Hence after removing the letters in the positions 1,4,6,9 the string is nenrine.
 */
import java.util.*;

public class ReverseandRemoveletters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        char[] l = input.toCharArray();
        int[] a = new int[input.length()];
        int count = 0;

        for (int i = 0; i < l.length; i++) {
            if (l[i] == 'a' || l[i] == 'e' || l[i] == 'i' || l[i] == 'o' || l[i] == 'u') {
                a[count] = i;
                count++;
            }
        }

        StringBuilder reversed = new StringBuilder(input).reverse();
        for (int i = 0; i < count; i++) {
            reversed.setCharAt(a[i], ' ');
        }

        System.out.print(reversed.toString().replaceAll(" ", ""));
        sc.close();
    }
}
