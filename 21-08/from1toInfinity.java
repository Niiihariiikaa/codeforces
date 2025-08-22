import java.util.Scanner;
public class from1toInfinity {
    public static long infinity(long n){
        long sum = 0;
        long du = 0;

        for (long i = 1; ; i++) {  // run infinitely, stop manually
            String s = Long.toString(i);
            for (int j = 0; j < s.length(); j++) {
                if (du == n) return sum;  // stop exactly at nth digit
                sum += s.charAt(j) - '0';
                du++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong();
            System.out.println(infinity(k));
        }
        sc.close();
    }
}
