/*
 In a shop, discounts were provided as below.
- If the label price of an item is more than Rs.400, then the discount is 20%.
- If the label price of an item is more than Rs.500, then the discount is 25%.
- If the label price of an item was more than or equal to Rs.1000, then the discount is 50%.
- Finally if the total purchase amount after discount is more than Rs.2000 a further discount of Rs.100 is provided.

The label prices of the items purchased will be provided as input. The program has to calculate the final price payable by the buyer (customer).

Boundary Conditions:
Number of items bought will be from 1 to 20.

Input Format:
First line will contain the number of items (N)
Next N lines will contain the label price of N items.

Output Format:
The final price payable by the buyer rounded off to two decimal places.

Sample Input/Output:

Example 1:

Input:
3
1000
1200
400

Output:
1500.00

Explanation:
1000,1200,400 after discount becomes 500,600,400 (20% discount is applicable only if the label price is more than Rs.400)
Hence net payable amount = 500+600+400 = 1500
 */

import java.util.*;

public class FestiveDiscount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int sum = 0, c, d;

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            if (a[i] > 400 && a[i] <= 500) {
                d = (int) (a[i] * 0.20);
                c = a[i] - d;
                sum += c;
            } else if (a[i] > 500 && a[i] < 1000) {
                d = (int) (a[i] * 0.25);
                c = a[i] - d;
                sum += c;
            } else if (a[i] >= 1000) {
                d = (int) (a[i] * 0.50);
                c = a[i] - d;
                sum += c;
            } else {
                sum += a[i];
            }
        }

        if (sum > 2000) {
            System.out.printf("%.2f", (float) (sum - 100.0));
        } else {
            System.out.printf("%.2f", (float) sum);
        }
        s.close();
    }
}