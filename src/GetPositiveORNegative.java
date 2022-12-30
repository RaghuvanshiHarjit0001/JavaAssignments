import java.util.Scanner;

public class GetPositiveORNegative {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value");
        int input = scanner.nextInt();
        if(input<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is positive");
        }
    }
}
