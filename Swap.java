class Swap {
    public static void main(String[] args) {
       int a=5 ,b=10, temp=0;;
       System.out.println("Before Swapping:\n"+"a="+a+" b="+b);
       Swapping(a,b,temp); //method to swap using third variable 
    }

    private static void Swapping(int a, int b, int temp) { //swapping of two numbers using third variable is done here 
       temp=a;
       a=b;
       b=temp;
       System.out.println("After Swapping:\n"+"a="+a+" b="+b);
    }
}