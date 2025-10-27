import java.util.*;

public class Main {
    static int countTrailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Trailing zeroes in " + n + "! = " + countTrailingZeroes(n));
    }
}
