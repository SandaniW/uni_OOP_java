import java.util.Scanner;
public class GetSum {
    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        for(int i=0;i<num;i++){
            System.out.println(i);
        }

    }
}
