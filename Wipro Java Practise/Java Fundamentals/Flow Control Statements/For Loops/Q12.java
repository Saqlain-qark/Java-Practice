/*
 * Write a program to check if a given number is prime or not using for loop.
 */

import java.util.Scanner;

class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
      //  int flag = 0;
        for (int i = 1; i <= number/2;) {
            if ((number == 2 || number == 3)){
                System.out.println(number+" is a prime number");
                break;
            }
            else if(number%i==0) {
                System.out.println(number+" is not a prime number"); 
                break;               
            }
            else{
                System.out.println(number+" is a prime number");
                break;
            }
        }  sc.close();
    }
}