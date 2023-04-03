import java.util.*;
public class bag_op {

	public static void main(String[] args) {
		double w;
        String c;
        int n,op,opt=-1,choice,del_n,in_p;
        Scanner sc = new Scanner(System.in);
        bag[] b=new bag[20];   //array of objects
        do{System.out.println("Choose from the dropdown below:");
        System.out.println("1.Create an object");
        System.out.println("2.Display the objects");
        System.out.println("3.Delete an object at specified location");
        System.out.println("4.Insert an object at specified location");
        op=sc.nextInt();
        switch(op){
            case 1:{
                System.out.println("What kind of object do you want to create:");
                System.out.println("1.Default object");
                System.out.println("2.Parameterized object");
                System.out.println("3.Color set to default");
                System.out.println("4.Weight set to default");
                choice=sc.nextInt();
                switch(choice){
                    case 1:{
                    	n=bag.return_tot_obj();
                        b[n]=new bag();
                        bag.increment();
                        System.out.println("Object created successfully.");
                        break;
                    }
                    case 2:{
                        System.out.println("Enter the color of the object:");
                        c=sc.next();
                        System.out.println("Enter the weight of the object:");
                        w=sc.nextInt();
                        n=bag.return_tot_obj();
                        b[n]=new bag(c,w);
                        bag.increment();
                        System.out.println("Object created successfully.");
                        break;
                    }
                    case 3:{
                        System.out.println("Enter the weight of the object:");
                        w=sc.nextInt();
                        n=bag.return_tot_obj();
                        b[n]=new bag(w);
                        bag.increment();
                        System.out.println("Object created successfully.");
                        break;
                    }
                    case 4:{
                        System.out.println("Enter the color of the object:");
                        c=sc.next();
                        n=bag.return_tot_obj();
                        b[n]=new bag(c);
                        bag.increment();
                        System.out.println("Object created successfully.");
                        break;
                    }
                }
                break;
                }
            case 2:{
            	n=bag.return_tot_obj();
            	System.out.println("SrNo."+"\t"+"Color"+"\t"+"Weight");
                for(int i=0;i<n;i++){
                    System.out.print((i+1)+"."+"\t");
                    b[i].display();
                }
                bag.output();
                break;
            }
            case 3:{
                System.out.println("Which object do you want to delete?");
                del_n=sc.nextInt();
                //b[(del_n)-1].delete();
                n=bag.return_tot_obj();
                for(int i=del_n;i<n;i++){
                	b[i-1]=b[i];
                }
                n=bag.return_tot_obj();
                //b[n-1].delete();
                bag.decrement();
                bag.output();
                break;
            }
            case 4:{
                System.out.println("Enter the position where you want to insert the object:");
                in_p=sc.nextInt();
                n=bag.return_tot_obj();
                for(int i=in_p;i<=n;i++){
                	b[i+1]=b[i];
                }
                System.out.println("What kind of object do you want to create:");
                System.out.println("1.Default object");
                System.out.println("2.Parameterized object");
                System.out.println("3.Color set to default");
                System.out.println("4.Weight set to default");
                choice=sc.nextInt();
                switch(choice){
                    case 1:{
                        b[in_p-1]=new bag();
                        bag.increment();
                        System.out.println("Object created successfully.");
                        break;
                    }
                    case 2:{
                        System.out.println("Enter the color of the object:");
                        c=sc.next();
                        System.out.println("Enter the weight of the object:");
                        w=sc.nextInt();
                        b[in_p-1]=new bag(c,w);
                        bag.increment();
                        System.out.println("Object created successfully.");
                        break;
                    }
                    case 3:{
                        System.out.println("Enter the weight of the object:");
                        w=sc.nextInt();
                        b[in_p]=new bag(w);
                        bag.increment();
                        System.out.println("Object created successfully.");
                        break;
                    }
                    case 4:{
                        System.out.println("Enter the color of the object:");
                        c=sc.next();
                        b[in_p-1]=new bag(c);
                        bag.increment();
                        System.out.println("Object created successfully.");
                        break;
                    }
                }
            }
        }
       System.out.println("Do you want to continue:(YES=1,NO=0)");
        opt=sc.nextInt();
    }while(opt==1);

	}

}

