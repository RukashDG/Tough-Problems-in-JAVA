import java.util.*;
public class Secdlarg 
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
        //return a[total numbers in array-2]; -2 is a Second position.  
        
            System.out.print(arr[n-2]);
       
 
    }
}

