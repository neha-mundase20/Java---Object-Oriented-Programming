import java.util.*;
public class Rectangle extends shape{

    public void getdata(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x=sc.nextDouble();

        System.out.println("Enter the value of y:");
        y=sc.nextDouble();
    }

    public void computeArea(){
        double area;
        area=x*y;
        System.out.println("The area of rectangle is:" + area);
    }
    
}
