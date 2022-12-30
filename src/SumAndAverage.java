import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Please enter a number");
            a += scanner.nextInt();
        }
        int average = a/5;
        System.out.println("Sum of digit:- "+a +" Average:- "+average);
    }
}
