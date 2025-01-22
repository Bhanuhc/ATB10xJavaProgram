package Tasks_Java;

public class Task5_CLI_Big2 {
    public static void main(String[] args){
        String string_a=args[0];
        int a=Integer.parseInt(string_a);
        String string_b=args[1];
        int b=Integer.parseInt(string_b);
        char result=(a>b)?'a':'b';
        System.out.println(result);
    }
}
