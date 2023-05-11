import java.util.Scanner;


public class Discount {
    public static void main(String[] args) {
        System.out.println("Enter the quantity");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if((x*100)<=1000) System.out.println("No Discount");
        else System.out.println("The Discount is 10% of "+x*100+" Total Discount is "+(.1*(x*100)));
        sc.close();
    }
}
