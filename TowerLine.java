/*
Four towers A, B, C, D are to be erected.
Tower A is to communicate with tower C.
Tower B is to communicate with tower D.
Line of sight issue can occur under the following conditions-
 when tower B or D is in the straight line connecting A and C-
 when tower A or C is in the straight line connecting B and D
The program must accept the co-ordinates of all four towers and print yes or no depending on whether Line of sight issue will occur or not.
Input Format:
The first line will contain X and Y co-ordinates of tower A separated by a space.
The second line will contain X and Y co-ordinates of tower B separated by a space.
The third line will contain X and Y co-ordinates of tower C separated by a space.
The fourth line will contain X and Y co-ordinates of tower D separated by a space
Output Format:The first line will contain yes or no (smaller case)
Boundary Conditions:The value of the co-ordinates will be from -500 to 500.
Example Input/Output 1:
0 0
0 -2
2 0
0 2
Output:
yes
Example Input/Output 2:
Input:
0 0
0 -2
2 0
0 -5
Output:
no
 */
import java.util.*;
public class TowerLine{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
String[] input1 = s.nextLine().trim().split(" ");
String[] input2 = s.nextLine().trim().split(" ");
String[] input3 = s.nextLine().trim().split(" ");
String[] input4 = s.nextLine().trim().split(" ");

int ax = Integer.parseInt(input1[0]);
int ay = Integer.parseInt(input1[1]);
int bx = Integer.parseInt(input2[0]);
int by = Integer.parseInt(input2[1]);
int cx = Integer.parseInt(input3[0]);
int cy = Integer.parseInt(input3[1]);
int dx = Integer.parseInt(input4[0]);
int dy = Integer.parseInt(input4[1]);

int flag = 0;
int flag1 = 0;

if ((((bx <= ax && by <= cx) || (bx >= cx && bx >= ax)) && ((by <= ay && by <= cy) || (by >= ay && by >= cy))) && (((dx <= ax && dx <= cx) || (dx >= cx && dx >= ax)) && ((dy <= ay && dy <= cy) || (dy >= ay && dy >= cy)))) {
    flag = 1;
}

if ((((ax <= bx && ax <= dx) || (ax >= bx && ax >= dx)) && ((ay <= by && ay <= dy) || (ay >= by && ay >= dy))) && (((cx <= bx && cx <= dx) || (cx >= bx && cx >= dx)) && ((cy <= by && by <= dy) || (cy >= by && cy >= dy)))) {
    flag1 = 1;
}

if (flag == 1 && flag1 == 1) {
    System.out.println("no");
} else {
    System.out.println("yes");
}
s.close();
}
}
