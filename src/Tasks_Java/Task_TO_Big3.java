package Tasks_Java;

public class Task_TO_Big3 {
    public static void main(String[] args){
        int a=100;
        int b=50;
        int c=200;
        char big=(a>b)?((a>c)?'a':'c'):((b>c)?'b':'c');
        System.out.println(big);
    }
}
