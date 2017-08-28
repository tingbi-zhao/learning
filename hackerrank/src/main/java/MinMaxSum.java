import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long min=Long.MAX_VALUE-2;
        long max=0;

        long sum = 0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            long v = in.nextLong();
            if (min > v) min = v;
            if (max < v) max = v;
            sum += v;
        }

        System.out.printf("%1$d %2$d", sum - max, sum-min);
    }
}
