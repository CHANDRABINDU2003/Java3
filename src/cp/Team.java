import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int y=0;
        while(p-->0)
        {
            
            int a =s.nextInt();
            int b =s.nextInt();
            int c =s.nextInt();
           
         if((a+b+c)>=2){
            y++;
           
        }   
        }
       
            System.out.println(y);
    }
   
}
