/*Recently a security committee decided to enforce the following rules when
an employee creates/changes his/her password.-
The password must contain atleast one special character among # ! _ $ @-
The password must contain atleast two numbers-
The password must contain atleast one upper case alphabet and one lower case alphabet.-
The password must have a minimum length of 8.- The password must have a maximum length of 25
.The program must accept a given password string P as input and check for these rules and output VALID or INVALID.
Boundary Conditions:Length of P is from 2 to 50.
Input Format:First line will contain the string value of the password P
Output Format:VALID or INVALID based on the check performed by the program by applying the rules.
Example Input/Output:
Example 1:Input:
kiC_3b0x3r
Output:VALID
Example 2:Input:
m@d31nindia
Output:INVALID
Explanation:No alphabet in uppercase.
Example 3:Input:
M1kT!s0
Output:INVALID
Explanation:
Minimum length must be 8 */
import java.util.*;

public class StrongPasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        char[] l = input.toCharArray();
        int digit = 0, lower = 0, upper = 0, special = 0;

        for (int i = 0; i < l.length; i++) {
            if (Character.isDigit(l[i])) {
                digit++;
            }
            if (Character.isLowerCase(l[i])) {
                lower++;
            }
            if (Character.isUpperCase(l[i])) {
                upper++;
            }
            if (l[i] == '#' || l[i] == '!' || l[i] == '@' || l[i] == '_' || l[i] == '$') {
                special++;
            }
        }

        if (digit >= 2 && lower >= 1 && upper >= 1 && special >= 1 && (l.length >= 8 && l.length <= 25)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }sc.close();
    }

}
