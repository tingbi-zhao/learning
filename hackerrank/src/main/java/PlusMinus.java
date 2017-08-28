import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] counter = new int[3];
        float[] fraction = new float[3];

        for (int i=0; i<n; i++) {
            int num = in.nextInt();

            if (num>0) {
                counter[0]++;
            } else if (num<0) {
                counter[1]++;
            } else{
                counter[2]++;
            }

        }

        fraction[0] = ((float) counter[0])/n;
        fraction[1] = ((float) counter[1])/n;
        fraction[2] = ((float) counter[2])/n;

        System.out.printf("%.6f%n", fraction[0]);
        System.out.printf("%.6f%n", fraction[1]);
        System.out.printf("%.6f%n", fraction[2]);
    }

}
