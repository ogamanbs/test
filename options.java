import java.util.Scanner;
public class options {
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
                result = a + b;
                break;
            case 2 : 
                result = a - b;
                break;
            case 3 : 
                result = a * b;
                break;
            case 4 : 
                result = a / b;
                break;
        }
        sc.close();
        return result;
    }
    public static void main(String[] args){
        options obj = new options();
        double x ;
        x = obj.choose();
        System.out.println("\nThe result is : " + x);
        System.out.println("");
    }
}