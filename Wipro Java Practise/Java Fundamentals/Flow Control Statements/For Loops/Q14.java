import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum= 0;
        // logic for separating the digits from the number
        for(int i=0; i<=n%10; i++){
            sum += n%10;
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
