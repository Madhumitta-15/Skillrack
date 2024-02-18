/*Simon wishes to convert lower case alphabets to upper case and vice versa. Help Simon by writing a program which will accept a string value S as input and toggle the case of the alphabets. Numbers and special characters remain unchanged. 

Input Format: First line will contain the string value S 

Output Format: First line will contain the string value with the case of the alphabets toggled. 

Constraints: Length of S is from 2 to 100 

Sample Input/Output:
Example 1: 
Input: 
GooD mORniNg12_3 
Output: 
gOOd MorNInG12_3 

Example 2: 
Input:
R@1nBow 
Output:
r@1NbOW */
import java.util.*;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String n = sc.nextLine(); 
        char[] str=n.toCharArray();
        for (int i=0; i<str.length; i++)
    {
        if (str[i]>='A' && str[i]<='Z')
            str[i] = (char) (str[i] + 'a' - 'A');
        else if (str[i]>='a' && str[i]<='z')
            str[i] = (char) (str[i] + 'A' - 'a');
    }
    System.out.println(String.valueOf(str));
    sc.close();
}
}
