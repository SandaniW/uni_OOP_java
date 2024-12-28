import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args){
        int num,prevSum=0,sum=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scanner.nextInt();
        for(int i=0;i<num;i++){
            System.out.println(sum);
            sum = sum + prevSum;
            prevSum = sum;

        }
    }
}
