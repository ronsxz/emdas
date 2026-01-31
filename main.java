import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double result = 0;

        System.out.print("Enter first number: ");
        num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scan.nextDouble();
        System.out.print("Choose a operator (*, +, -): ");
        char operator = scan.next().charAt(0);

        switch(operator){
            case '+':
                result = addition(num1, num2);
                break;
            default:
                System.out.println("Invalid operator")
        }
    }
    public static double addition(double num1, double num2){
        return num1 + num2;
    }
}