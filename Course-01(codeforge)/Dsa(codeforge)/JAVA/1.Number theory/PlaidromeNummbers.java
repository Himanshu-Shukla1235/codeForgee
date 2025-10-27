import java.util.Scanner;

public class PlaidromeNummbers {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   // input
        int original=num;
        if(num<0){
           System.out.print("No"); 
           return;
        }
        int reversed =0;


        while(num>0){
            reversed=reversed*10+num%10;
            num/=10;
        }

        if(reversed == original){
         System.out.print("Yes"); 
        }else{
            System.out.println("No");
        }
        return;
  }

    
   


}
