import java.util.*;
public class SequenceNum 
    {
            public static void main(String[] args)
            {
                Scanner obj=new Scanner(System.in);
                int n=obj.nextInt();
                int[] arr=new int[n];
                int i,j,f=0;
                for(i=0;i<n;i++)
                {
                    arr[i]=obj.nextInt();
                }
                for(i=1;i<n;i++)
                {
                    if(arr[i]<arr[i-1])
                    {
                        System.out.print(i+1);
                        f++;
                        break;
                    }
                }
                if(f==0) //if the number is not a consequence print -1.
                {
                    System.out.println("-1");
                }
            }
        }
    
    


