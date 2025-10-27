import java.util.Scanner;


class countOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();   // input
        int res = 0;

        while (number > 0) {
            res++;
            number /= 10;
        }

        System.out.println(res);   // output
    }
}
    
