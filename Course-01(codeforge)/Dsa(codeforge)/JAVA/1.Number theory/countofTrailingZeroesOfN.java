import java.util.*;

public class countofTrailingZeroesOfN {
    static int countTrailingZeroes(int n) {
        int count = 0;
        while (n % 10 == 0 && n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Correct variable name
    
        int n = sc.nextInt();                // Use 'sc' not 'sci'
        System.out.println("Trailing zeroes in " + n + " = " + countTrailingZeroes(n));
    }
}
