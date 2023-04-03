public class finally_block {
    public static void main(String[] args) {
        try{
            int data=23;
            int result=23/0;
        }

        catch(NullPointerException n){
            System.out.println("I am in catch block");
        }

        finally{
            System.out.println("Finally block is always executed");
        }

        System.out.println("I am in main method");
    }
}
