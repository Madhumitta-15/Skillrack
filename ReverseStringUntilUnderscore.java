import java.util.*;
public class Hello{
public static void main(String[] args)
  { Scanner s=new Scanner(System.in);
   String s1=s.nextLine();
   int u=s1.indexOf('_');
   if(u==-1)
     System.out.print(new StringBuffer(s1).reverse().toString());
   else if(u==0)
     System.out.print (s1); 
   else { 
   if(u==s1.length()-1) 
   {
     String[] s2=s1.split("_");
   }
   System.out.print(new StringBuilder (s2[0]).reverse().toString()+"_");
  }
else
{ String[] s2=s1.split("_");
 System.out.print(new StringBuilder (s2[0]).reverse().toString()+"_"+s2[1]);
}
}
}
