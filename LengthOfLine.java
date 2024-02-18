
/*A line is denoted by the x and y co-ordinates of the two end points. The program must print the length of the line. Input Format: First line will contain the x and y co-cordinates of point 1 separated by a space. Second line will contain the x and y co-cordinates of point 2 separated by a space 
Output Format: The length of the line rounded up to two decimal places. If there is no floating point representation then a .00 is to appear at the end of the output. 
Sample Input/Output: Example 1: 
Input: 0 4 
3 0 
Output: 5.00 
Example 2: 
Input: 2 2 
14 7 
Output: 13.00 
Example 3: 
Input: 0 0 
3 3 
Output: 4.24 */
import java.util.Scanner;
import java.lang.Math;

public class LengthOfLine {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[] x = s.nextLine().split(" ");
        String[] y = s.nextLine().split(" ");
        int[] xi = new int[x.length];
        int[] yi = new int[y.length];
        for (int i = 0; i < x.length; i++) {
            xi[i] = Integer.parseInt(x[i]);
        }
        for (int i = 0; i < y.length; i++) {
            yi[i] = Integer.parseInt(y[i]);
        }
        int t = Math.abs(xi[0] - yi[0]);
        int t1 = Math.abs(xi[1] - yi[1]);
        double res = Math.sqrt(t * t + t1 * t1);
        System.out.printf("%.2f", res);
        s.close();
    }
}
