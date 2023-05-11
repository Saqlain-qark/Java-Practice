public class SumofDigits {
    public static void main(String[] args) {
        int x=132;
        System.out.println((x/100)+((x%=100)/10)+(x%10)); //sum of three digits 
    }
}
