import java.util.Scanner;

public class initialscap
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence  : ");
        String st = sc.nextLine();
        String st1 = " " + st;
        int len = st1.length();
        
        String n = "";
        
        for(int i = 0; i < len; i++)
        {
            char ch = st1.charAt(i);
            if(ch == ' ')
            {
                n= n+ch;
               i++;
               ch = st1.charAt(i);
               n = n + Character.toUpperCase(ch);
            }
            else{
                n = n +ch;
            }
        }
        System.out.println(n);
        
    }
}