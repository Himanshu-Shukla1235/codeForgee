//----------------------------Number of trailing Zeroes of Factorial n---------------

import java.util.Scanner;

 class TrailingZeroesInFactorial {

    
    static int countTrailingZeroes(int n) {
        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Number of trailing zeroes in " + n + "! is " + countTrailingZeroes(n));
        
        sc.close();
    }
}

