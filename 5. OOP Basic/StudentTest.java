public class StudentTest {
    public static void main(String[] args){
        Student s1 = new Student();
       
        s1.setStudNum(1000); 
        s1.setFname("Juan");
        s1.setLname("dela Cruz");
        s1.setAge(18);
        
        System.out.println("Student ID Number : " + s1.getStudNum());
        System.out.println("Student Fname : " + s1.getFname());
        System.out.println("Student Lname  : " + s1.getLname());
        System.out.println("Student Age    : " + s1.getAge()); 
      } 
}
