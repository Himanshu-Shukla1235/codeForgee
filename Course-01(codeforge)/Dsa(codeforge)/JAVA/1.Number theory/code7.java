
   //-------------------------Lcm---------------
import java.util.Scanner;

class code7 {

    // Function to find GCD using Euclidean Algorithm
    static int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM using the relation: LCM * GCD = a * b
    static int findLCM(int a, int b) {
        return Math.abs(a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}


