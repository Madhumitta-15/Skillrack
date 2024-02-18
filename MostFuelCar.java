/*
Given fuel consumed and the distance covered for a certain number of cars, find the most fuel efficient car.

Input Format:
First line will contain the number N representing the number of cars.
Next N lines will contain the fuel consumed in liters and the distance run in kilometers (both separated by a space).

Output Format:
The number of the car which is most fuel efficient.

Sample Input/Output:

Example 1:
Input:
3
10 300
20 550
15 460

Output:
3

Explanation:
Average mileage of car 1 = 300/10 = 30 km/liter, car 2 = 550/20 = 27.5 km/liter, car 3 = 460/15 = 30.67 km/liter
Hence car 3 is most fuel efficient and hence 3 is printed.


 */






import java.util.ArrayList;
import java.util.Scanner;

public class MostFuelCar {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int a = sc.nextInt(); 
    ArrayList<Double> b = new ArrayList<>();
    for (int i = 0; i < a; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        double t = (double) y / x;
        b.add(t);
    }
    double max = Double.MIN_VALUE;
    int maxIndex = -1;
    for (int i = 0; i < b.size(); i++) {
        if (b.get(i) > max) {
            max = b.get(i);
            maxIndex = i;
        }
    }
    System.out.println(maxIndex + 1);
    sc.close();
}
}


