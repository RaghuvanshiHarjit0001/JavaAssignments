import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String value = scanner.nextLine();
        System.out.println("Lower Case");
        System.out.println(value.toLowerCase());
        System.out.println("Reverse String");
        char[] array = value.toCharArray();
        for(int i = array.length-1; i>=0; i--){
            System.out.print(array[i]);
        }
        System.out.println();

        Integer num = 10 ;
        System.out.println(num.toString());

        String str = "123";
        int num1 = Integer.parseInt(str);
        System.out.println(num1);

    }
}
