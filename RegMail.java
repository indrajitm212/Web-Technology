import java.util.Scanner;
import java.util.regex.*;

public class RegMail{
    public static void main(String[] args){
        String pattern=".*@\\w.\\w";
        Pattern pat=Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        Matcher match=pat.matcher(sc.nextLine());
        System.out.println("Text matches?"+match.find());
    }
}