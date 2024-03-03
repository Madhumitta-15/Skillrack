/*
 The runs scored by two cricket players is passed as input. The program must print the total runs scored by the better player.
The better player is the player with a higher average. It is not necessary that both the players have played/scored in the same number of matches.
If both the players have same average, then print the runs scored by the player who has the highest total runs.

Boundary Conditions:
- The number of matches played for any player will not exceed 20.
- If a negative value is passed as runs scored, then the program output  must be INVALIDINPUT.


Input Format:
First line will contain the runs scored by player one. The scores are separated by one or more spaces.
Second line will contain the runs scored by player two. The scores are separated by one or more spaces.

Output Format:
The first line will contain the total runs scored by the player having higher average.


Sample Input/Output:

Example 1:
Input:
20 30 40
50 10

Output:
90

Explanation:
Both the players have same average 30. Hence the output is the highest total runs which is by player 1. (20+30+40 = 90)


 */

import java.util.*;

public class CricketPlayer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] aInput = s.nextLine().split(" ");
        int[] a = new int[aInput.length];
        for (int i = 0; i < aInput.length; i++) {
            a[i] = Integer.parseInt(aInput[i]);
        }

        String[] bInput = s.nextLine().split(" ");
        int[] b = new int[bInput.length];
        for (int i = 0; i < bInput.length; i++) {
            b[i] = Integer.parseInt(bInput[i]);
        }

        int t1 = 0;
        int t2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                System.out.println("INVALIDINPUT");
                System.exit(0);
            } else {
                t1 += a[i];
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] < 0) {
                System.out.println("INVALIDINPUT");
                System.exit(0);
            } else {
                t2 += b[i];
            }
        }

        double avg1 = (double) t1 / a.length;
        double avg2 = (double) t2 / b.length;

        if (avg1 == avg2) {
            System.out.println(t1 > t2 ? t1 : t2);
        } else if (avg1 > avg2) {
            System.out.println(t1);
        } else {
            System.out.println(t2);
        }
        s.close();
    }
}
