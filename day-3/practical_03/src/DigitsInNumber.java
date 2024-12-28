import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args){
        int num,count = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        while(num != 0){
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
}
