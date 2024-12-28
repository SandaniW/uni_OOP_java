import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        System.out.print("Enter name:");
        student1.setName(scanner.nextLine());
        System.out.print("Enter email: ");
        student1.setEmail(scanner.nextLine());
        System.out.print("Enter gender: ");
        student1.setGender(scanner.next().charAt(0));
            longStar();
            System.out.println("\t Student Details");
            longStar();
            System.out.println("\t Name: " + student1.getName());
            System.out.println("\t Email: "+ student1.getEmail());
            System.out.println("\t Gender: " + student1.getGender());
            longStar();



    }
    public static void longStar(){
        System.out.println("**************************************************");

    }

}