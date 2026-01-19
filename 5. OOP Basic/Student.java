public class Student{
    private int studNum;
    private String studLname;
    private String studFname;
    private int studAge;
    
    public void setStudNum(int n){
        studNum = n;
    }
    public void setLname(String ln){
        studLname = ln;
    }
    public void setFname(String fn){
        studFname = fn;
    }
    public void setAge(int a){
        studAge = a;
    }

    public int getStudNum(){
        return studNum;
    }

    public String getLname(){
        return studLname;
    }

    public String getFname(){
        return studFname;
    }

    public int getAge(){
        return studAge;
    }
}