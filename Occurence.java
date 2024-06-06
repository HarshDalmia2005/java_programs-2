import java.util.*;
class Occurence
{
    
  static int first=-1;
   static int last=-1;
   
  static void caloccur(int idx,String s,char ch)
    {
       
        
        if(idx==s.length())
        {
              System.out.println(first);
                System.out.println(last);
                return;
            }
                
        if(s.charAt(idx)==ch)
        {
            if(first==-1)
            {
                first=idx;            
            }
            else
            {
                last=idx;                  
            }
           
        }
      
            caloccur(idx+1,s,ch);
            
       

    }

 public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        String s;char ch;
        System.out.println("ENTER THE STRING");
        s=sc.nextLine();
        int l=s.length();
         System.out.println("ENTER THE ELEMENT");
        ch=sc.next().charAt(0);
     
        caloccur(l-1,s,ch);
    }}