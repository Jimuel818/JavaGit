public class laptop{
    private String brand;
    private double price;
    private String ram;
    private String cpu;
    private int storage;
    private int choice;

    laptop(String b,double p,String r,String c, int s, int n){
     brand = b;
     price = p;
     ram = r;
     cpu = c;
     storage = s;
     choice = n;
    }

    public String getbrand(){
        return brand;
    }
      public double getprice(){
        return price;
    }
      public String getram(){
        return ram;
    }
    public String getcpu(){
        return cpu;
    }
    public int getstorage(){
        return storage;
    }
    public int getchoice(){
        return choice; 
    }

    public void checklaptop(){
      if (choice == 1)
        System.out.println("Selected Laptop : Lenovo");
      else
        System.out.println("Selected Laptop : Acer");
    }    


}