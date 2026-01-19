public class EmployeeTest {
    public static void main(String[] args){
        Employee Clerk = new Employee();
        Employee Secretary = new Employee();
       
        Clerk.setEmpNum(1000); 
        Clerk.setFirstName("Ma. Olive");
        Clerk.setLastName("Baltazar");
        Clerk.setSalary(16000.00);
        
        System.out.println("Employee ID Number : " + Clerk.getEmpNum());
        System.out.println("Employee FirstName : " + Clerk.getFirstName());
        System.out.println("Employee LastName  : " + Clerk.getLastName());
        System.out.println("Employee Salary    : " + Clerk.getSalary() + "\n"); 
    
        System.out.println("Employee ID Number : " + Secretary.getEmpNum());
        System.out.println("Employee FirstName : " + Secretary.getFirstName());
        System.out.println("Employee LastName  : " + Secretary.getLastName());
        System.out.println("Employee Salary    : " + Secretary.getSalary()); 
    }   
}
