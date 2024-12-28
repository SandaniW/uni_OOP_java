import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numOne,numTwo;
        float sum=0;
        String symbol;
        System.out.print("Num one: ");
        numOne = scanner.nextInt();
        System.out.print("Num two: ");
        numTwo = scanner.nextInt();
        System.out.println("Enter the operator to calculate");
        symbol = scanner.next();
        switch (symbol){
            case "+": sum = numOne + numTwo; break;
            case "-": sum = sum = numOne - numTwo; break;
            case "*":sum = numOne * numTwo; break;
            case "/":
                sum = numOne / numTwo;

                break;
            default:
                System.out.println("not a valid input");
                break;

        }
        System.out.println(numOne + symbol + numTwo + " = " + sum);
    }
}
