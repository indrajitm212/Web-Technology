import java.util.Scanner;

public class Anagram{
    public static char[] Sort_array(char[] x){
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]>x[j]){
                    char temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        return x;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter word 1:");
        String s=sc.nextLine().toLowerCase();
        System.out.print("Enter word 2:");
        String t=sc.nextLine().toLowerCase();
        if(s.length()!=t.length()){
            System.out.println("Not an anagram");
        }
        else{
            char[] a=s.toCharArray();
            char[]b=t.toCharArray();
            a=Sort_array(a);
            b=Sort_array(b);
            boolean flag=true;
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    System.out.print("Not an anagram");
                    flag=false;
                     break;
                }
            }
            if(flag) System.out.print("It is an anagram");
        }
        sc.close();
    }
}