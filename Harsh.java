 import java.util.*;
class Harsh
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int i,j,p,t;int n=6;
            
             
            for(i=1;i<=n;i++)
            {
                 for(j=1;j<=3;j++)
                 {
                      System.out.print('*'+" ");
                    }
                    
                    
                    
                 for(j=1;j<=2;j++)
                 {
                     if(i==3&&j==1 || i==3&&j==2 || i==4&&j==1 || i==4&&j==2)
                      System.out.print('*'+" ");
                      else{
                      System.out.print(" ");
                      System.out.print(" ");
                    }}
                    
                    
                 for(j=1;j<=3;j++)
                 {
                      System.out.print('*'+" ");
                    }
                    System.out.println();
                }}}}