public class bag {
	private String color;
    private double weight;
    private static double total_wt;
    private static int total_count;

    public bag(){                                 //default constructor
        color="Red";
        weight=10.0;
        total_wt=total_wt+weight;
    }

    public bag(String c,double w){                //parameterized constructor
        color=c;
        weight=w;
        total_wt=total_wt+weight;
    }

    public bag(String c){                         //weight set to default
        color=c;
        weight=10.0;
        total_wt=total_wt+weight;
    }

    public bag(double w){                         //color set to default
        color="Red";
        weight=w;
        total_wt=total_wt+weight;
    }

    public static void output(){                  //static method to display static variables
        System.out.println("The total number of objects created are:");
        System.out.println(total_count);

        // System.out.println("The total weight of bag is:");
        // System.out.println(total_wt);
    }

    public static void increment(){
        total_count=total_count+1;
        //total_wt=total_wt+weight;
    }
    
    public static int return_tot_obj(){
    	return total_count;
    }
    
    public static void decrement(){
        total_count=total_count-1;
        //total_wt=total_wt-weight;
    }

    public void display(){
        System.out.println(color+"\t"+weight);
    }

    public void delete(){
        color=null;
        weight=0;
    }



}