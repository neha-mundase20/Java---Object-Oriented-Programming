//WAP TO DISPLAY AREA OF SPHERE AND HEMISPHERE USING INTERFACES
 interface area{
    double pi =3.14;     //by default final and static

    void calculateArea(double r);  //by default public and abstract
 }

 class Sphere implements area{
    public void calculateArea(double r){
        double area;
        area=(4.0)*pi*r*r;
        System.out.println("Curved Surface Area of Sphere is:"+area);
    }
 }

 class Hemisphere implements area{
    public void calculateArea(double r){
        double area;
        area=(2.0)*pi*r*r;
        System.out.println("Curved Surface Area of Hemisphere is:"+area);
    }
 }

public class interfaces_program {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.calculateArea(2.0);
        
        Hemisphere h = new Hemisphere();
        h.calculateArea(2.0);
    }
}
