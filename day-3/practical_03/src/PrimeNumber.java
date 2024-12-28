import java.io.PrintStream;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        int num, count= 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("num?");
        num = scanner.nextInt();
        for(int i=1;i<(num/2);i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count==1){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
