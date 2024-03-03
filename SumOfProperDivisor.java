
/*Given a natural number N , the program must print the sum of all its proper divisors.

Definition: A proper divisor of a natural number is the divisor that is strictly less than the number.

Boundary Conditions:
1 < N <= 100000

Input Format:
First line will contain the integer value of N.

Output Format:
First line will contain the sum of all the proper divisors of N.


Sample Input/Output:

Example 1:
Input:
2

Output:
1

Explanation:
1 is the only proper divisor of 2. Hence sum is also 1.

*/
import java.util.*;

public class SumOfProperDivisor {

    public static int divSum(int num) {
        int result = 0;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == (num / i))
                    result += i;
                else
                    result += (i + num / i);
            }
        }

        return (result + 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(divSum(num));
        s.close();
    }
}
