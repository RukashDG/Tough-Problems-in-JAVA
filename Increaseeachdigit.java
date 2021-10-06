import java.util.*;
public class Increaseeachdigit 
{
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int temp,count=0;
      temp=n;
      while(temp>0)
      {
          temp=temp/10;
          count++;
      }
      int a[]=new int[count];
      for(int i=count-1;i>=0;i--)
      {
         a[i]=n%10;
         n=n/10;
      }         //the value is stored in array
      for(int i=0;i<count;i++)
        System.out.println(a[i]);
                    //the value is increase here
    for(int i=0;i<count;i++) 
    {
        a[i]=a[i]+1;
    }
         
    for(int i=0;i<count;i++)
        System.out.print(a[i]);
    }
}

