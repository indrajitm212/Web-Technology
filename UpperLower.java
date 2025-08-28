import java.util.*;

public class UpperLower{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        int up_var=0;
        int low_var=0;
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)) up_var++;
            if(Character.isLowerCase(c)) low_var++;
        }
        System.out.println("Uppercase Letters:"+up_var);
        System.out.println("Lowercase Letters:"+low_var);
        sc.close();
    }
}