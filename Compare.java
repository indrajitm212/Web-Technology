public class Compare{
    public static void main(String[] args){
        String s="a";
        String t="A";
        System.out.println("Comparision using equals:"+s.equals(t));
        System.out.println("Comparision using CompareTo:"+s.compareTo(t));
        System.out.println("Comparision using ==:"+(s==t));
    }
}