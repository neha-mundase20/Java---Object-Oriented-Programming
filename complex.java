public class complex {
        private int real;
        private int img;

        public complex(){             //default constructor 
         real=0;
         img=0;
        }
     
        public complex(int r, int i) {     //parameterized constructor
           this.real = r;
           this.img = i;
        }
     
        public void add(complex x, complex y) {   //addition of two complex numbers
           this.real = x.real + y.real;
           this.img = x.img + y.img;
        }
     
        public void sub(complex x, complex y) {    //subtraction of two complex numbers
           this.real = x.real - y.real;
           this.img = x.img - y.img;
        }

        public void mul(complex x, complex y){     //multiplication of two complex numbers
           this.real=(x.real*y.real)-(x.img*y.img);  //i**2=-1
           this.img=(x.real*y.img)+(x.img*y.real);
        }

        public void div(complex x, complex y){    //division of two complex numbers
           this.real=((x.real*y.real)+(x.img*y.img))/((y.real*y.real)+(y.img*y.img));
           this.img=((x.img*y.real)-(x.real*y.img))/((y.real*y.real)+(y.img*y.img));
        }

      public void display() {
           System.out.println("The addition is:" + this.real + "+" + this.img + "i");
        }
     }

