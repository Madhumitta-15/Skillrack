/*An expression E is passed as an input to the program. The expression will contain three numbers A, B and C, one equal symbol and one of the mathematical operators + - * /
But the given mathematical operator is incorrect and hence the expression is not valid. Hence the program must identify the correct operator and print that as the output.


Input Format:
First line will contain the expression E

Output Format:
First line will contain the correct mathematical operator


Sample Input/Output:

Example 1:
Input:
5-4=20

Output:
*

Explanation:
Only 5 multiplied with 4 gives 20. Hence - must be replaced with *.*/

import java.util.Scanner;

public class CorrectOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	s=s.replace("-","=");
	s=s.replace("+","=");
	s=s.replace("*","=");
	s=s.replace("/","=");
	String[] s1=s.split("=");
	int a=Integer.parseInt(s1[0]);
	int b=Integer.parseInt(s1[1]);
	int c=Integer.parseInt(s1[2]);
	if(a+b==c)
	System.out.print('+');
	else if(a-b==c)
	System.out.print('-');
	else if(a*b==c)
	System.out.print('*');
	else
	System.out.print('/');
    sc.close();
    }
}
