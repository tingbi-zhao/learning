import java.util.Scanner;

public class DiagonalDiff {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] ar = new int[n][n];
        int a=0;
        int b=0;

        for (int x=0; x<n; x++) {
            for (int y=0; y<n; y++) {
                ar[x][y] = in.nextInt();
                if (x==y) {
                    a += ar[x][y];
                }

                if (x+y+1==n) {
                    b += ar[x][y];
                }
            }
        }

        if (a > b) {
            System.out.print(a-b);
        } else {
            System.out.print(b-a);
        }

    }
}