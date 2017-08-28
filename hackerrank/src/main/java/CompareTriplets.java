import java.util.Scanner;

public class CompareTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] result = new int[2];

        compare(result, a0, b0);
        compare(result, a1, b1);
        compare(result, a2, b2);

        return result;
    }

    static void compare(int[] result, int a, int b) {
        result[0] += a > b ? 1 : 0;
        result[1] += a < b ? 1 : 0;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}

