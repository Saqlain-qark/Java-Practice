public class Reverse3Digit {
    public static void main(String[] args) {
        int x=132456789, f,s,t,u,v,w,y,z,a;
        f=x/100000000; //first digit
        x%=100000000;
        s=x/10000000;
        x%=10000000;
        t=x/1000000;
        x%=1000000;
        u=x/100000;
        x%=100000;
        v=x/10000;
        x%=10000;
        w=x/1000;
        x%=1000;
        y=x/100;
        x%=100;
        z=x/10;
        a=x%10; //third digit
        System.out.println(a+""+z+""+y+""+w+""+v+""+u+""+t+""+s+""+f); //printing reverse number 
    }
}
