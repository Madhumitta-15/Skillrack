/*Two soccer teams A and B play a series of matches over a period of time. In a match, the winning team gets 3 points. If the match ends in a tie (draw) with both teams scoring same g, then both the teams get one point each. The losing team does not get any point. The program must accept the g scored by both team A and B in certain number of matches and print the cumulative scores of team A and B separated by a space. 
Input Format: 
First line will contain the g scored by team A, with the goal values separated by a space. 
Second line will contain the g scored by team B, with the goal values separated by a space. 
Output Format: First line will contain the scores of team A and B separated by a space. 
Boundary Conditions: 
The length of the input with the space separated g is from 3 to 100. 
Example Input/Output 1: 
Input: 3 5 1 3 2 0 
Output: 7 1 
Explanation: Team A drew the first match and hence both team A and B got one point each. Team A won both matches two and three and hence got additional 6 points. So the final score of team A is 7 and team B is 1. */

import java.util.Scanner;

public class SeriesTeamScore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] gtA = s.nextLine().split(" ");
        String[] gtB = s.nextLine().split(" ");
        
        int scoreA = 0;
        int scoreB = 0;
        
        for (int i = 0; i < gtA.length; i++) {
            int gA = Integer.parseInt(gtA[i]);
            int gB = Integer.parseInt(gtB[i]);
            
            if (gA > gB) {
                scoreA += 3;
            } else if (gA < gB) {
                scoreB += 3;
            } else {
                scoreA++;
                scoreB++;
            }
        }
        
        System.out.println(scoreA + " " + scoreB);
        
        s.close();
    }
}
