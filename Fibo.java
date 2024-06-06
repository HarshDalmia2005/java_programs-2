import java.util.*;
class Fibo//0,1,1,2,3,5,8,13.......n0
{
    
  static int calfibo(int a,int b,int n)
    {
        int c;
        if(n==0)
         return 0;
        else
        c=a+b;
        System.out.print(","+c);
       return calfibo(b,c,n-1);
        
    } 
    public static void main(String args[])
    { int a=0;int b=1;
        
        System.out.print(a+",");
        System.out.print(b);
        int n=8;
        calfibo(a,b,n-2);
        }}