import java.util.Scanner;
import java.util.Arrays;

public class secretnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            long n = s.nextLong();
            int count = 0;
            long[] res = new long[20];
            long pw = 10;
            while (pw + 1 <= n) {
                if (n % (pw + 1) == 0) {
                    res[count++] = n / (pw + 1);
                }
                pw *= 10;
            }
            if (count == 0) {
                System.out.println(0);
            } else {
                long[] ans = Arrays.copyOf(res, count);
                Arrays.sort(ans);
                System.out.println(count);
                for (int i = 0; i < count; i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(ans[i]);
                }
                System.out.println();
            }
        }
        s.close();
    }
}
