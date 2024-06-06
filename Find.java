 import java.util.*;
class Find//finds the two non repeating no.s in an array
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
         
         for(i=0;i<n;i++)
         {
             XOR=XOR^a[i];
            }
            int c=0;
         
            while(XOR!=0)
            {
                int bit=XOR&1;
                if(bit==1)
                {
                    c++;
                    break;
                }
                else
                {
                    XOR=XOR>>1;
                    c++;
                }
            }
            
            int x=0;int y=0;
             for(i=0;i<n;i++)
         {
            int b=a[i]&(1<<c);
             if(b>0)
             {
                 x=x^a[i];
                }
                else
                {
                    y=y^a[i];
                }
            }
      System.out.println(x);
      System.out.println(y);
       
    }}