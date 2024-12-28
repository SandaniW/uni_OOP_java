import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args){
        int num,remainder;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        remainder = num%10;
        while(num!=0){
            System.out.print(remainder);
            num = num/10;
            remainder = num%10;

        }


    }
}
