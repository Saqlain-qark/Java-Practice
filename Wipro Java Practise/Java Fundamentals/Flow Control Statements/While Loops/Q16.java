import java.util.Scanner;

class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be reversed: ");
        int n = sc.nextInt();
        int reverse = 0;
        while(n>0){
            reverse = reverse * 10 + n%10;    
            n = n/10;
        }
        System.out.println(reverse);
        sc.close();
    }
}
