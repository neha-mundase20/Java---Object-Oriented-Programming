import java.util.Scanner;

public class Professor extends Person {

    private int bp,agp;
    private String dp_name;

    public void getdata3()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR BASIC PAY =  ");
        bp = sc.nextInt();

        System.out.println("ENTER YOUR AGP =  ");
        agp = sc.nextInt();

        System.out.println("ENTER YOUR DEPARTMENT NAME = ");
        dp_name = sc.next();
    }

    public void calculate()
    {
        double salary;

        salary= (119/100) *(bp+agp) + (30/100) * (bp+agp) - (12/100) * (bp+agp) - (0.1/100) * (bp+agp);

        System.out.println("YOUR NET SALARY IS =  " + salary);

    }



}
