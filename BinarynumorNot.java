import java.util.*;
public class BinarynumorNot 

{
    public static void main(String[] args)
    { int f=0;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        while(n>0)
        {
            int d=n%10;
            if(d>1)
            {
                f++;
                break;
            }
            n=n/10;
        }
        if(f!=0)
            System.out.println("No");
        
        else
         {
            System.out.println("yes");
        }
    }
}


