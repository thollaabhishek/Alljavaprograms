package assingment;
import java.util.Scanner;

public class KboatFrameWord
{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String str = in.nextLine();
       String word = "" + str.charAt(0);
       int len = str.length();
       
       for (int i = 0; i < len; i++) {
           char ch = str.charAt(i);
           if (ch == ' ')
               word += str.charAt(i + 1);
       }
       
       System.out.println(word);
    }
}