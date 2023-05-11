import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println((int)(x*y)); //Area of a rectangle
        sc.close();
    }
}
