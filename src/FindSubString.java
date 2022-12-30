import java.util.Scanner;

public class FindSubString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String value = scanner.nextLine();
        System.out.println("Enter the numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(value.substring(num1,num2+1));
    }
}
