
import java.util.Scanner;

public class laptopTest{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        laptop lap = new laptop("lenovo",3500,"8gb","Ryzen 5 5600",500, 1);
    
       /*    
        buyer.setstorage(1000); 
        buyer.setcpu("");
        buyer.setbrand("")
        
        System.out.println(" : " + buyer.getstorage());
        System.out.println(": " + buyer.getcpu());
        System.out.println(": " + buyer.getbrand());
        */
       
        //while (true)
        System.out.println("Laptop Company");
        System.out.println("1.Check laptop list");
        System.out.println("2.buy laptop");
        System.out.println("3.Create account");
        System.out.println("4.Pay Product");
        System.out.println("5.exit");
        int choice = input.nextInt();
        // i dont have enough time

        if(choice ==1){
            System.out.println("Laptop list");
            System.out.println("1.lenovo");
            System.out.println("2.Acer");
            System.out.println("Enter your choice: ");
            int choice1 = input.nextInt();

            if (choice1 ==1){
           
            System.out.println("Laptop Brand : " + lap.getbrand());
            System.out.println("Laptop Price: " + lap.getprice());
            System.out.println("Laptop Ram  : " + lap.getram());
            System.out.println("Laptop Cpu: " + lap.getcpu()); 
            System.out.println("Laptop Storage:" + lap.getstorage());
            }
            else if (choice ==2){
            }
            else{
                System.out.println("Invalid input");
            
           
        
        }

        }


    }

}