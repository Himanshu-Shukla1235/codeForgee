 // Recursive factorial function
import java.util.Scanner; 

public class FindingFactorialRecursive {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = recSol(n);
        System.out.println(res);
       
    }

 
   
    static long recSol(long n) {
        if (n == 1) {
            return n;
        }
        return recSol(n - 1) * n;
    }


  
}
