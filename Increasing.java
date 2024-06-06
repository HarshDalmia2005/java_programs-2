import java.util.*;
class Increasing
{
    static boolean cal(int a[],int idx )
    {
        if(idx==0)
        {
            return true;
        }
       if(a[idx]<=a[idx-1])
       {
           return false;
        }
        else
        {
           return cal(a, idx-1);
            
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE SIZE");
        n=sc.nextInt();
        
        int a[]=new int[n];
        System.out.println("ENTER"+n+"ELEMENTS");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        if(cal(a,n-1)==true)
        {
            System.out.println("INCREASING");
        }
        else
        {
        System.out.println("INVALID");
    }
            
    }}
    