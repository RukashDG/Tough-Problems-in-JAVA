import java.util.*;
public class Alternativeswap 
{
    public static void main(String[] args)
    {
        int count=0,r=0,j=0;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=n;
        while(n>0)
        {
            int t=n%10;
            count++;
            r=r*10+t;
            n=n/10;
        }
        System.out.println(r);  //Reverse a number
        int[] ar=new int[100];
        if(count==2 ||count==4||count==6)
        {
            while(r>0)
            {
                ar[j]=r%10;
                r=r/10;                     //System.out.println(count);
                j++;
            }
            for(int i=0;i<j;i++)
            {
                System.out.print(ar[i]);
            }
            
        int i = 0;              //Swaping Process start
        while (i < j - 1) {
            int l = ar[i];
            ar[i] = ar[i + 1];
            ar[i + 1] = l;
            i = i + 2;      //imprt condition to jump to 1 to 3rd place
        } 
         System.out.println("");
        System.out.print("After swap list are:");
        for (i = 0; i < j; i++) {
            System.out.print(" " + ar[i]);
        }
    
        }
        else
            System.out.println("-1");
    }
}


    

