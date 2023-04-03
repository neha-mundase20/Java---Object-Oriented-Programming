import java.util.Scanner;

public class Person {
    protected String name,pan_no,email_id;
    protected int age,dob,employee_id,mob_no;

    public void getdata()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR NAME =  ");
        name = sc.next();

        System.out.println("ENTER YOUR PAN CARD NO =  ");
        pan_no = sc.next();

        System.out.println("ENTER YOUR EMAIL ID =  ");
        email_id = sc.next();

        System.out.println("ENTER YOUR AGE =  ");
        age = sc.nextInt();

        System.out.println("ENTER YOUR DATE OF BIRTH =  ");
        dob = sc.nextInt();

        System.out.println("ENTER THE EMPLOYEE ID =  ");
        employee_id = sc.nextInt();

        System.out.println("ENTER YOUR MOBILE NO =  ");
        mob_no = sc.nextInt();
    }
}
