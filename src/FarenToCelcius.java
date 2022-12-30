import java.util.Scanner;

public class FarenToCelcius {
    public static void main(String[] args){
        // °C = [(°F-32)×5]/9
        float celsius;
        float fahrenheit;
        System.out.println("Please enter the value of fahrenheit");
        Scanner scanner = new Scanner(System.in);
        fahrenheit = scanner.nextFloat();
        celsius = ((fahrenheit-32)*5)/9;
        System.out.println(String.format("%.1f", fahrenheit)+"°F = "+ String.format("%.1f", celsius)+"°C");
        
    }
}
