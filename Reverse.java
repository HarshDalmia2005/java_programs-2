import java.util.*;
class Reverse//Reverse of a string
{
    
  static void calreverse(int len,String s)
    {
        if(len==0)
        {
          System.out.print(s.charAt(len));
           return;
        }
        else
    {
      
        System.out.print(s.charAt(len));
        calreverse(len-1,s);
        return;
    }
}

   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("ENTER THE STRING");
        s=sc.nextLine();
        int l=s.length();
        calreverse(l-1,s);
    }}