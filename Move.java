import java.util.*;
class Move
{
   static String str="";static String s1="";
    static void shift(String s,int idx,char ch )
    {
        
        if(idx==0)
        {
            System.out.println(s.charAt(idx)+s1+str);
            return;
        }
       if(s.charAt(idx)==ch)
       {
            str=ch+str;
        }
        else
        {
           s1=(s.charAt(idx))+s1;
        
    }
    shift(s,idx-1,ch);
}
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l;
        System.out.println("ENTER THE STRING");
        String s=sc.next();
          System.out.println("ENTER THE CHARACTER");
          char ch=sc.next().charAt(0);
       l=s.length();
       shift(s,l-1,ch);
            
    }}
    