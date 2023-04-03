import java.util.*;
public class arithmetic_operations{
    private int num1;
    private int num2;
    private int result;

    Scanner sc=new Scanner(System.in);

    // public void getdata(){
    //     System.out.println("Enter first number:");
    //     num1=sc.nextInt();
    //     System.out.println("Enter second number:");
    //     num2=sc.nextInt();
    // }

    public arithmetic_operations(){
        int flag = 1;
        do{
        try {
        System.out.println("Enter first number:");
        num1=sc.nextInt();
        System.out.println("Enter second number:");
        num2=sc.nextInt();
        flag=0;
        } 
        catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Number format exception found");
        }
    }while(flag==1);
    }

    public void division(){

            // result=num1/num2;
            // System.out.println("The division of two numbers is:");
            // System.out.println(result);


        try{
            result=num1/num2;
            System.out.println("The division of two numbers is:");
            System.out.println(result);
        }

        //maintain heirarchy of catch blocks

        // catch(Exception e){
        //     System.out.println("Exception is caught:Division isn't possible"); //we throw an error
        //     e.printStackTrace();      //used to trace and print error shown by compiler
        // }

        catch(ArithmeticException a){
            System.out.println("Exception is caught:Division isn't possible"); //we throw an error
            a.printStackTrace();      //used to trace and print error shown by compiler
        }

        catch(RuntimeException r){
            System.out.println("Exception is caught:Division isn't possible"); //we throw an error
            r.printStackTrace();      //used to trace and print error shown by compiler
        }

        catch(Exception e){
            System.out.println("Exception is caught:Division isn't possible"); //we throw an error
            e.printStackTrace();      //used to trace and print error shown by compiler
        }
    }

    // public void display(){
    //     System.out.println("The division of two numbers is:");
    //     System.out.println(result);
    // }
}