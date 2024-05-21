
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int p= s.nextInt();
       while(p-->0){
           String str=s.next();
           int u= str.length();
           if(u>10)
           {
               System.out.println(""+str.charAt(0)+(u-2)+str.charAt(u-1));
           }
           else
           {
               System.out.println(str);
           }
       }
    }
   
}
