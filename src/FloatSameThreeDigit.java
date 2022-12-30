import java.util.Scanner;

public class FloatSameThreeDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float a, b;
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        float c = Float.parseFloat(String.format("%.3f", a));
        float d = Float.parseFloat(String.format("%.3f", b));
        if (c == d){
            System.out.println("Number is equal up to 3 decimal digit");
        } else {
            System.out.println("Number is not equal");
        }

    }
}
