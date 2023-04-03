import java.util.Scanner;
public class complex_op {
   public static void main(String[] args) {
      int op = -1;
      int r;
      int i;
      complex c1;
      complex c2;
      complex c3;
      Scanner sc = new Scanner(System.in);
      do{System.out.println("Enter the real part of first number:");
      r = sc.nextInt();
      System.out.println("Enter the imaginary part of first number:");
      i = sc.nextInt();
      c1 = new complex(r, i);

      System.out.println("Enter the real part of second number:");
      r = sc.nextInt();
      System.out.println("Enter the imaginary part of second number:");
      i = sc.nextInt();
      c2 = new complex(r, i);

      c3 = new complex();

      System.out.println("Choose from the dropdown below:");
      System.out.println("1.Adddition of two complex numbers");
      System.out.println("2.Subtraction of two complex numbers");
      System.out.println("3.Multiplication of two complex numbers");
      System.out.println("4.Division of two complex numbers");

      System.out.println("Enter the choice:");
      int n = sc.nextInt();
         switch(n) {
         case 1:
            c3.add(c1, c2);
            c3.display();
            break;
         case 2:
            c3.sub(c1, c2);
            c3.display();
            break;
         case 3:
            c3.mul(c1, c2);
            c3.display();
            break;
         case 4:
            c3.div(c1, c2);
            c3.display();
         }
          System.out.println("Do you want to continue?(YES=1/NO=0)");
          op = sc.nextInt();
     } while(op == 1);
     
   }
   
}

