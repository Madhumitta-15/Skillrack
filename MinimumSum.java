/*Minimum Sum M out of N */
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;
public class MinimumSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        List<Integer> d = IntStream.range(0, a).mapToObj(i -> s.nextInt()).collect(Collectors.toList());

        List<Integer> h = generateCombinations(d, b).stream()
                .mapToInt(list -> list.stream().mapToInt(Integer::intValue).sum()).boxed().collect(Collectors.toList());

        System.out.println(Collections.min(h));
        s.close();
    }

   
    private static List<List<Integer>> generateCombinations(List<Integer> d, int b) {
        return IntStream.range(0, 1 << d.size())
                .filter(i -> Integer.bitCount(i) == b)
                .mapToObj(i -> IntStream.range(0, d.size()).filter(j -> (i & (1 << j)) != 0).mapToObj(d::get)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }
}
