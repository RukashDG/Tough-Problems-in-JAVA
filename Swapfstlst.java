import java.util.*;
public class Swapfstlst 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a,b=0,r=0,temp;
        temp=n;
        a=temp%10; //last num
        System.out.println(a);
        while(n>10)
        {
            b=n%10;
            n=n/10;
        }
        int f=n; //1st num
        n=temp/10;
        System.out.println(n);
        System.out.println(f);
        while(n>10)
            {
            int c=n%10;
             r=r*10+c;
            n=n/10;
            }
            System.out.println(r);
            int swap=a;
            while(r>0)
            {
               int t=r%10;
               swap=swap*10+t;
               r=r/10;
            }
            System.out.println(swap);
            swap=swap*10+f;
            System.out.println("Output");
            System.out.println(swap);
 }
}

