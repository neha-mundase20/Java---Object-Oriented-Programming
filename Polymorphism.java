import java.util.*;
public class Polymorphism {
    public static void main(String[] args) {
        //COMPILE TIME POLYMORPHISM
        // Circle circle=new Circle();
        // circle.getdata();
        // circle.computeArea();
        // Triangle triangle=new Triangle();
        // triangle.getdata();
        // triangle.computeArea();

        //RUN TIME POLYMORPHISM
        int choice,op;
        do{
        System.out.println("Choose from the dropdown below:");
        System.out.println("1.Calculate area of circle");
        System.out.println("2.Calculate area of triangle");
        System.out.println("3.Calculate area of rectangle");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        shape ref;  //reference variable of base class but we don't know it points which class
        switch(choice){
        case 1:
        ref=new Circle(); //now ref variable refers to class Circle()
        ref.getdata();
        ref.computeArea();
        break;

        case 2:
        ref=new Triangle();
        ref.getdata();
        ref.computeArea();
        break;

        case 3:
        ref=new Rectangle();
        ref.getdata();
        ref.computeArea();
        break;
        }
        System.out.println("Do you want to continue?(YES=1/NO=0)");
        op=sc.nextInt();
      }while(op==1);

        //shape obj =new shape(); we cannot create object of abstract class
    }
}

//same method computeArea() has different definition according to different implementation i.e.
//polymorphism

//shape class acts as a interface using which we designed all rest classes
//inheritance has "is a" relationship


//OUTPUT
/*Choose from the dropdown below:
1.Calculate area of circle   
2.Calculate area of triangle 
3.Calculate area of rectangle
1
Enter the value of radius:
5
Area of circle is:      78.5        
Do you want to continue?(YES=1/NO=0)
1
Choose from the dropdown below:
1.Calculate area of circle     
2.Calculate area of triangle   
3.Calculate area of rectangle  
2
Enter the value of x:
3
Enter the value of y:
4
Area of circle is:      6.0
Do you want to continue?(YES=1/NO=0)
1
Choose from the dropdown below:
1.Calculate area of circle
2.Calculate area of triangle
3.Calculate area of rectangle
3
Enter the value of x:
2
Enter the value of y:
4
The area of rectangle is:8.0
Do you want to continue?(YES=1/NO=0)
0*/