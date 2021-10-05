import java.util.*;
public class SortArray 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[100];
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for ( i = 0; i < n; i++)   
        {  
            for ( j = i + 1; j < n; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
        
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
 
    }
}

    

