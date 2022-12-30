import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        Integer value = scanner.nextInt();
        System.out.println("Number of digits "+ value.toString().length());

    }
}
