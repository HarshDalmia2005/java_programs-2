import java.util.*;
class Remove//removes duplicates
{
   static String str="";static String s1="";
   public static boolean map[]=new boolean[26];
    static void remove(String s,int idx)    
    {
        if(idx==s.length())
        {
            System.out.println(s1);
            return;
        }
        
        char ch=s.charAt(idx);
        if(map[ch-'a']==true)
       {
           remove(s,idx+1);
        }
        else
        {
            s1+=ch;
            map[ch-'a']=true;
            remove(s,idx+1);
        }
        
        
       
}
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l;
        System.out.println("ENTER THE STRING");
        String s=sc.next();
         
       l=s.length();
       remove(s,0);
            
    }}
    