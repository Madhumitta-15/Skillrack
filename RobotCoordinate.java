
/*
 *The initial x and y co-ordinate values of a Robot are passed as the input.
The rest of the input values are the directions in which the Robot moves along with the distance in that direction.
The directions are denoted by N, E, S, W for North, East, South and West.
The program should print the final x and y co-ordinates of the Robot
INPUT:
x-2 y3 W3 N1
OUTPUT:
x-5 y4
 */
import java.util.*;

public class RobotCoordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().trim().split(" ");
        int sumx = 0, sumy = 0;

        for (int i = 0; i < l.length; i++) {
            String a = l[i];
            char ch = a.charAt(0);
            String s = a.substring(1);
            int num = Integer.parseInt(s);

            if (ch == 'x' || ch == 'E') {
                sumx += num;
            } else if (ch == 'W') {
                sumx -= num;
            } else if (ch == 'N' || ch == 'y') {
                sumy += num;
            } else {
                sumy -= num;
            }
        }

        String s1 = String.valueOf(sumx);
        String s2 = String.valueOf(sumy);
        System.out.println("x" + s1 + " y" + s2);
        sc.close();
    }
}
