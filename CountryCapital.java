/*Input data containing N countries and their capital will be provided as input. The program must then print the capital for a given country. 
Input Format: First line will contain the integer value N representing how many country-capital pairs are to be provided as input. Next N lines will contain the name of the country and the name of the captial as string values separated by a space. The last line will contain the name of the country as a string value for which the capital is to be printed as output. 
Output Format: First line will contain the capital of the country. If the name of the country is NOT found in the input data then NONE must be printed as output. 
Constraints: N will be from 2 to 100. 
Sample Input/Output: 
Example 1: 
Input: 5 
Afghanistan Kabul 
Austria Vienna 
Armenia Yerevan 
Chile Santiago 
Croatia Zagreb 
Austria 
Output: Vienna */
import java.util.*;
public class CountryCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Map<String, String> d = new HashMap<>();

        for (int i = 0; i < a; i++) {
            String x = sc.next();
            String y = sc.next();
            d.put(x, y);
        }

        String c = sc.next().trim();
        if (!d.containsKey(c)) {
            System.out.println("NONE");
        } else {
            System.out.println(d.get(c));
        }
        sc.close();
    }
}
