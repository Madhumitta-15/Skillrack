/*Given a string S as the input Write a program to print the reverse order of the words in the string S.

Input Format:
The first line contains S.

Output Format:
The first line contains the words in the reverse order.
Boundary Conditions:
1 <= Length of S <= 100

Example Input/Output 1:
Input:
I Love India

Output:
India Love  I

Example Input/Output 2:
Input:
Something must be printed!
Output:
printed! be must Something */


import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
                        Scanner s=new Scanner(System.in);
                        String str=s.nextLine();
                        String a[]=str.split(" ");
                        for(int i=a.length-1;i>=0;i--)
                        System.out.print(a[i]+" ");
                        s.close();
            }
}


