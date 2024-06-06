 import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int i,j,p,t;int n=5;
            
             
            for(i=1;i<=n;i++)
            {
                 for(j=1;j<=(n-i);j++)
                { System.out.print(" ");
                    System.out.print(" ");
                    }
                    for(j=i;j>=2;j--)
                {
                     System.out.print(j+" ");
                    }
               
                    
                     for(j=1;j<=i;j++)
                {
                     System.out.print(j+" ");
                    }
                    System.out.println();
                }
            }
        }}