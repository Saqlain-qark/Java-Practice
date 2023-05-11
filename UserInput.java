import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum= "+(x+y)+"\nProduct= "+(x*y));
        sc.close(); //to close the scanner so that (there is no resource leak) 'releasing resource used by scanner'
    }
}
