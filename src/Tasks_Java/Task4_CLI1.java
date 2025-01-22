package Tasks_Java;

public class Task4_CLI1 {
    public static void main(String[] args){
        String name=args[0];
        String age_string=args[1];
        int age=Integer.parseInt(age_string);
        String salary_string=args[2];
        int salary=Integer.parseInt(salary_string);
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }
}
