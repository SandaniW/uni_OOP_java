import java.util.Scanner;

public class practical02 {
    public static void main(String[] args){
        int num1,num2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number one: ");
        num1 = scanner.nextInt();
        System.out.print("Enter number two: ");
        num2 = scanner.nextInt();

        System.out.println("Addition is " + add(num1,num2));
        System.out.println("Substraction is " + substract(num1,num2));
        System.out.println("Mulitiplication is " + multiply(num1,num2));
        System.out.println("Division is " + divide(num1,num2));
    }

    public static int add(int num1,int num2){
        int sum;
        sum = num1 + num2;
        return sum;
    }
    public static int substract(int num1,int num2){
        int sum;
        sum = num1 - num2;
        return sum;
    }
    public static int multiply(int num1,int num2){
        int sum;
        sum = num1 * num2;
        return sum;
    }
    public static int divide(int num1,int num2){
        int sum;
        sum = num1 / num2;
        return sum;
    }
}
