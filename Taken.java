public class Taken {
    public static void main(String[] args) {
        int x=5696, first, second, third, fourth;
        first= (x/1000)+2; //first digit + 2
        x%=1000; //updation of x from 4 digit to 3 i.e, excluding of 1st digit
        if (first>9) first=1; //if sum of first digit with is greater than 9 then make it 1
        second=(x/100)+2; 
        x%=100;
        if(second>9) second=1;
        third=(x/10)+2;
        if (third>9) third=1;
        fourth=(x%10)+2;
        if(fourth>9) fourth=1;
        System.out.println(first+""+second+""+third+""+fourth); // print sum of each of the digits separately
    }
}
