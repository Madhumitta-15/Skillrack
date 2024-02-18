
/*The day corresponding to the first date of a given month is provided as input to the program. Then a specific date D of the month is provided. The program must  print the day (one among MON,TUE, WED, THU, FRI, SAT, SUN) of the date D.

Input Format:
First line will contain the day (one among MON,TUE, WED, THU, FRI, SAT, SUN) of the first date of the month.
Second line will contain the value of the date D as an integer value.

Output Format:
First line will contain the day of the date D


Sample Input/Output:

Example 1:
Input:
MON
10

Output:
WED

Explanation:
If it is Monday on 1st of the month, then 10th of the month will be a Wednesday. Hence WED is printed.


Example 2:

Input:
FRI
24

Output:
SUN

Explanation:
If it is Friday on 1st of the month, then 22nd will also be a Friday. Hence 24th of the month will be a Sunday. Hence SUN is printed. */
import java.util.*;

public class PrintDayforgnDate {
    public static void main(String[] args) {
        String[] s = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
        String s1;
        int a, d = -1;
        Scanner sc = new Scanner(System.in);
        s1 = sc.next();
        a = sc.nextInt();
        for (int i = 0; i < 7; i++) {
            if (s[i].equals(s1)) {
                d = i;
            }
        }
        int f = d + a;
        switch (f % 7) {
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
        }
        sc.close();
    }
}
