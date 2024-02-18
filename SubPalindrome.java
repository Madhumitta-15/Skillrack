import java.util.*;
public class SubPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int count = 0;
        
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 2; j <= S.length(); j++) {
                if (isPalindrome(S.substring(i, j))) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
    
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


