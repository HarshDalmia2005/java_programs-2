import java.util.HashSet;
class Subsequences//alll unique subsequences of a string
{
   static String str="";static String s1="";
    static void subs(String s,int idx,String s1,HashSet<String>set )
    {
        
        if(idx==s.length())
        {
            if(set.contains(s1))
            {
            return;
        }
        else
        {
            
            System.out.println(s1);
            set.add(s1);
            return;
        }}
        char ch=(s.charAt(idx));
        subs(s,idx+1,s1+ch,set);
        
        subs(s,idx+1,s1,set);
     
    }


    
    public static void main(String args[])
    {
       String s="aaa";
        HashSet<String>set=new HashSet<>();
       subs(s,0,"",set);
            
    }}
    