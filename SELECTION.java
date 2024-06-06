import java.util.*;
class SELECTION
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("ENTER");
         n=sc.nextInt();
         int a[]=new int[n];
          System.out.println("input");
          for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
            } 
        for(int i=0;i<(n-1);i++)
        {
           int min=i;
           for(int j=i+1;j<n;j++)
        {
            if(a[min]>a[j])
            {
                min=j;
            }
        }
        int t=a[min];
        a[min]=a[i];
        a[i]=t;
    }

 for(int i=0;i<n;i++)
         {
System.out.println(a[i]);
}
}}