import java.util.*;
public class Triangle extends shape{
    public void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x=sc.nextDouble();

        System.out.println("Enter the value of y:");
        y=sc.nextDouble();
    }
    public void computeArea(){
        double area;
        area=0.5*x*y;
        System.out.println("Area of circle is:"+"\t"+area);
    }
}
