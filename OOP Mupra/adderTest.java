import java.util.Scanner;
public class adderTest{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        adder a = new adder();

        System.out.print("Enter First number: ");
        a.setNum1(input.nextInt());

        System.out.print("Enter Second number: ");
        a.setNum2(input.nextInt());


        System.out.print("The Sum is: "+ a.add());

        input.close();
    }
}