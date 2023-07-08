public class Calculator extends Menue{
    public static void main(String[] args){
        Calculator obj = new Calculator();
        System.out.println("\n\t   Calculator\n");
        obj.menueCard();
        double result = obj.choose();
        System.out.println("\nThe result is : " + result + "\n");
    }
}