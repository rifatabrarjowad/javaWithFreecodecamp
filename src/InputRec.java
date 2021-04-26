
import java.util.Scanner;
public class InputRec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb ;
        String name;

        System.out.println("Enter your name");
        name = input.next();

        System.out.println("Enter number");
        numb = input.nextInt();

        System.out.println("your name is = "+name);
        System.out.println("your number is = "+numb);

    }
}
