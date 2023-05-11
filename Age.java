import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("Enter number of people to enter their age: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter your age: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int oldest = largest(arr);
        int youngest = smallest(arr);
        sc.close();
        System.out.println("The oldest is : "+oldest);
        System.out.println("The youngest is : "+youngest);
        // for (int i=0; i<n; i++){
        //     System.out.println("The age is : "+arr[i]);
        // }
    }
    public static int largest(int arr[]) //oldest among three 
    {
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int smallest(int arr[]) //youngest among three
    {
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
