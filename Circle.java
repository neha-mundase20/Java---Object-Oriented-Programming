import java.util.*;;
public class Circle extends shape{

    public void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of radius:");
        x=sc.nextDouble();
    }

    public void computeArea(){
        double area;
        area=3.14*x*x;
        System.out.println("Area of circle is:"+"\t"+area);
    }
}
