import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] ar = new int[n][n];

        for(int i = 0; i<n; i++) {
            for (int j=0; j<n; j++) {
                ar[i][j] = in.nextInt();
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (ar[i][j] == 0) {
                    int count = 0;
                    int ia = i>0? i-1: 0;
                    int ib = i==n-1 ? n : i+2;
                    int ja = j> 0? j-1: 0;
                    int jb = j==n-1? n: j+2;
                    for (int k=ia; k<ib; k++) {
                        for (int m=ja; m< jb; m++) {
                            if (ar[k][m]==0) {
                                count++;
                            }
                        }
                    }

                    if (!list.contains(count)) {
                        list.add(count);
                    }
                }

            }
        }

        Collections.sort(list);

        for(int num : list) {
            System.out.println(num);
        }
    }
}