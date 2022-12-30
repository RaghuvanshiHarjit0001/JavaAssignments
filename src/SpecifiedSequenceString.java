import java.util.Scanner;

public class SpecifiedSequenceString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String value = scanner.nextLine();
        System.out.println("Enter the value to find in above string");
        String find = scanner.nextLine();
        boolean check = value.contains(find);
        if(check){
            System.out.println("String contains the value");
        }else {
            System.out.println("String does not contains the value");
        }
    }
}
