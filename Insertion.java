import java.util.*;
class Insertion
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
        for(int i=1;i<(n);i++)
        {
            int current=a[i];
            int j=i-1;
            while(j>=0 && current<a[j])
            {
                a[j+1]=a[j];
                 j--;
                }
                a[j+1]=current;
            }
              for(int i=0;i<n;i++)
         {
            System.out.println(a[i]);
        }}}