import java.util.Scanner;

public class FindingFactorial {
     public static void main(String[] args) {
        logic1();
       
    }

    // Iterative solution
    static void logic1() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();   // use long for large numbers
        long res = 1;

        long temp = n;
        while (temp>0) {
      
            res = res * temp;
            temp--;
        }
        System.out.println(res);
    }


}
