import java.util.Scanner;

public class Salary {

    public static void main(String args[])
    {

      /*  Assistant_professor c1 = new Assistant_professor();
        c1.getdata();
        c1.getdata1();
        c1.calculate();

        Associate_professor c2 =new Associate_professor();
        c2.getdata();
        c2.getdata2();
        c2.calculate();

        Professor c3 =new Professor();
        c3.getdata();
        c3.getdata3();
        c3.calculate(); */

        int n;
        Scanner sc = new Scanner(System.in);


        do {

            System.out.println("ENTER FOR WHOM YOU WANT TO PRINT SALARY SLIP : ");
            System.out.println("1.Assistant Professor");
            System.out.println("2.Associate Professor");
            System.out.println("3.Professor");
            System.out.println("4.Exit");
            n = sc.nextInt();

        switch (n) {
            case 1: {
                Assistant_professor c1 = new Assistant_professor();
                c1.getdata();
                c1.getdata1();
                c1.calculate();
            }break;

            case 2: {
                Associate_professor c2 = new Associate_professor();
                c2.getdata();
                c2.getdata2();
                c2.calculate();
            }break;

            case 3: {
                Professor c3 = new Professor();
                c3.getdata();
                c3.getdata3();
                c3.calculate();
            }break;
        }
        }while (n!=4);
    }
}
