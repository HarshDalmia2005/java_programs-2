import java.util.*;
class S
{
    public static void main(String args[])
    {
        StringBuilder s=new StringBuilder("harsh");
         System.out.println(s);
         
         s.insert(1,'o');//inserts in harsh at index 1
         s.insert(5,'e');//inserts e in hoarsh at index 5
          System.out.println(s);//prints hoarseh
          
          
         s.delete(2,3);//deletes the second index of hoarseh
         s.delete(5,6);//deletes the fifth index of horseh
         System.out.println(s);//prints horse
         
         s.setCharAt(1,'A');//(index,charcter) 
         s.setCharAt(4,'H');// replaces the char at that index with the inserted charcter
          System.out.println(s);//prints hArsH
          
            s.append(" DalMiA");//sticks the character or word in front of any string
             System.out.println(s);//prints hArsH D
        }}