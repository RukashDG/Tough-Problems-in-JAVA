import java.util.*;
public class Sequenceincrdecr 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int temp=n,count=0;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        int[] a=new int[count];
        int i=0,f=0;
        if(count>=3)
        {
            for(int j=count-1;j>=0;j--)
            {
                a[j]=n%10;
                n=n/10;
                
            }
            for(int k=0;k<count-2;k++)
            {
                if(a[k]-a[k+1] == a[k+1]-a[k+2] ){
                 f=1;
                System.out.println("Yes");
                break;
                }
                if(f==0)
                    System.out.println("No");
            }
        }
        else  
            System.out.println("No");
    }
}

    

