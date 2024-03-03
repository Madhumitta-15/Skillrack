/*Two string values S1 and S2 are passed as input. The program must print the count of common characters in the strings S1 and S2. 

Input Format: First line will contain the value of string S1 Second line will contain the value of string S2

Output Format: First line will contain the count of common characters. 

Boundary Conditions: Length of S1 and S2 is from 3 to 100. 

Sample Input/Output: 
Example 1: 
Input: 
china 
india 
Output: 
3 

Explanation: The common characters are i,n,a 

Example 2: 
Input: 
energy
every
Output:
4 

Explanation: The common characters are e,e,r,y
*/

import java.util.*;
public class CountCommonCharacters {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        
        Map<Character, Integer> c1 = new HashMap<>();
        Map<Character, Integer> c2 = new HashMap<>();
        
        for (char c : s1.toCharArray()) {
            c1.put(c, c1.getOrDefault(c, 0) + 1);
        }
        
        for (char c : s2.toCharArray()) {
            c2.put(c, c2.getOrDefault(c, 0) + 1);
        }
        
        int sum = 0;
        for (char c : c1.keySet()) {
            if (c2.containsKey(c)) {
                sum += Math.min(c1.get(c), c2.get(c));
            }
        }
        
        System.out.println(sum);
        s.close();
    }
}

