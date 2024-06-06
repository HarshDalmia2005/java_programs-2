import java.util.*;
class Flip
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,N;
        System.out.println("ENTER TWO NUMBERS");
        n=sc.nextInt();
        N=sc.nextInt();
        int XOR=N^n;
        int c=0;
        while(XOR!=0)
        {
           
            int bit=XOR&1;
            if(bit==1)
            {
                c++;
            }
            XOR=XOR>>1;
        }
        System.out.println(c);
    }}
                
        