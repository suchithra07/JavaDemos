import java.util.Scanner;

public class fibonacci {


        public static void main(String[] args) {
            int num1 = 0, num2 = 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A Number");
             int count = sc.nextInt();
            System.out.print("Fibonacci Series of "+count+" numbers:");

            for (int i = 1; i <= count; i++)
            {
                System.out.print(num1+" ");
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
        }
    }




