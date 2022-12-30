import java.util.Scanner;

public class LastIndexAndLength {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String value = scanner.nextLine();
        int index = value.length()-1;
        System.out.println("Last Index = "+ index+" Length of String = "+(index+1));

    }
}
