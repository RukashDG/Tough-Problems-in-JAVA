import java.util.*;
public class Reversenum 
{
    public static void main(String[] args)
    {
        int d,dif=0;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String s=Integer.toString(n); //String s=String.valueOf(n);
        for(int k=0;k<s.length();k++)
        {
            System.out.println(s.charAt(k));
        }
        int m=n,re=0;
        System.out.println("The number is reversed");
        while(n>0)
    {
        d=n%10;
        System.out.println(d);
        dif=dif*10+d;
        n=n/10;
    }
    System.out.println("The Number is Reversed: "+dif);
    while(dif!=0)
    {
        int remainder=dif%10;
        re=re*10+remainder;
        dif=dif/10;
    }
          System.out.println("The Orginal num is came:");
       System.out.print(re);
 
    }
}


