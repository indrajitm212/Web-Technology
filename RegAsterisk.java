import java.util.Scanner;

public class RegAsterisk{
    public static void main(String[] args){
        String pattern=".*\\d.*";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println(str.replaceAll("\\d","*"));
    }
}