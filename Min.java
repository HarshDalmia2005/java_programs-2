 import java.util.*;
class Min//calucates the min xor value among all the pairs in array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;int i;int XOR=0;
        System.out.println("ENTER");
         n=sc.nextInt();
         int a[]=new int[n];
          System.out.println("input");
          for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
            }
            
          Arrays.sort(a);
          int min=a[0]^a[1];
          
            for(i=0;i<(n-1);i++)
         {
             if((a[i]^a[i+1])<min)
             {
              min=a[i]^a[i+1];
            }
        }
        System.out.println(min);
    }
}