import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = sc.next();
        System.out.println("Enter your roll number: ");
        int roll_number = sc.nextInt();
        sc.next();
        System.out.println("Enter your field of interest: ");
        String foi = sc.nextLine();
        System.out.println("Hey, my name is "+name+" and my roll number is "+roll_number+". My field of interest is "+foi);
        sc.close();
    }
}
