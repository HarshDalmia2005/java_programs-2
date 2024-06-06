import java.util.*;
class TOWER//tower of hanoi
{
    
  static void Tower(int n,String src,String helper,String dest)
    {
        if(n==1)
        {
            System.out.println("Transfer disk"+n+"from"+src+"to"+dest);
            return;
        }
        else
        {
           Tower(n-1,src,dest,helper);
           System.out.println("Transfer disk"+n+"from"+src+"to"+dest);
           Tower(n-1,helper,src,dest);
            return;
        }}
        
          public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE NO. OF DISKS");
        n=sc.nextInt();
        Tower(n,"S","H","D");
    }}
          
          