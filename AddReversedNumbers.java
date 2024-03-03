/*A pair of numbers (X and Y) will be passed as input. The program must reverse the numbers and find the sum S. 
Then the sum S must be reversed and printed as output. - If any leading zeroes are obtained while reversing any of the numerical values they should be discarded. 
Boundary Conditions: 0 < X < 10000 0 < Y < 10000 
Input Format: First line will contain the value of X Second line will contain the value of Y 
Output Format: The first line will contain the sum S 
Sample Input/Output: 
Example 1: 
Input: 24 1 
Output: 34 
Explanation: 24 when reversed is 42. So 42+1 = 43. When 43 is reversed it is 34 and hence 34 is the output. */
import java.util.*;

public class AddReversedNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
               
                
        int X = Integer.parseInt(s.nextLine());
        int Y = Integer.parseInt(s.nextLine());
                
        int sum = reverse(X) + reverse(Y);
        int reversedSum = reverse(sum);
                
        System.out.println(reversedSum);
                
         s.close();
            }
            
            public static int reverse(int num) {
                int reversedNum = 0;
                while (num != 0) {
                    int digit = num % 10;
                    reversedNum = reversedNum * 10 + digit;
                    num /= 10;
                }
                return reversedNum;
            }
        }