import java.util.*;
class Keypad
{
   static String K[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
   
   static void keypad(String s,int idx,String comb)
   {
       if(idx==s.length())
       {
           System.out.println(comb);
           return;
        }
       
       char ch=s.charAt(idx);
       String str=K[ch-'0'];
   for(int i=0;i<str.length();i++)
   {   
       char c=str.charAt(i);
       keypad(s,idx+1,comb+c);
       
    }
    keypad(s,idx+1,comb);
}

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String s;
    System.out.println("ENTER THE STRING");
    s=sc.nextLine();
    keypad(s,0,"");
}
}
    