import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Number");
        int value = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(value + " * " + i + " = " + value*i);
        }
    }
}
