import java.util.*;
abstract class shape {
    protected double x,y;

    public void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x=sc.nextDouble();

        System.out.println("Enter the value of y:");
        y=sc.nextDouble();
    }

    // public void computeArea(){
    //     System.out.println("I'm in (base) shape class");
    // }

    abstract public void computeArea();
    //when you declare any method as abstract ,the class becomes abstract but vice versa isn't true
}
