import java.util.Scanner;
public class Result {
    double choose(){
        double result = 0.00;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter an operation : ");
        int n = sc.nextInt();
        System.out.print("\nEnter first number  : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        switch(n){
            case 1 : 
                result = (double)a + (double)b;
                break;
            case 2 : 
                result = (double)a - (double)b;
                break;
            case 3 : 
                result = (double)a * (double)b;
                break;
            case 4 : 
                result = (double)a / (double)b;
                break;
        }
        sc.close();
        return result;
    }
}