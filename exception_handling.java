public class exception_handling {
    public static void main(String[] args) {
        arithmetic_operations obj=new arithmetic_operations();
        //obj.getdata();
        obj.division();  
        System.out.println("I am in main method");    //this statement will not execute coz exception
        // is present in division

        //but after handling the exception it will be executed

        //I want to show that due to the exception the statements after the exception will not
        //execute and program will terminate but after handling the exception the program will run further


        //obj.display();
    }
}
