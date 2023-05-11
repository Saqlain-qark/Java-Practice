import java.util.Scanner;

public class ReverseInteger {
    public static long reverse(int x) {
        boolean negative = x < 0;
        long reversed = 0;
        x = Math.abs(x);
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        if (reversed > Integer.MAX_VALUE) {
            return reversed;
        }
        long result = negative ? -reversed : reversed;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = input.nextInt();
        long reversed = reverse(x);
        System.out.println("Reversed integer: " + reversed);
        input.close();
    }
}
