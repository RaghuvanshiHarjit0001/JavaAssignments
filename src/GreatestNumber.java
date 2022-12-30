import java.util.Scanner;

public class GreatestNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Please enter first number");
        a = scanner.nextInt();
        System.out.println("Please enter Second number");
        b = scanner.nextInt();
        System.out.println("Please enter Third number");
        c = scanner.nextInt();
       if(a > b & a > c){
           System.out.println(a +" is the greatest number");
       } else if (b > c){
           System.out.println(b +" is the greatest number");
       }else {
           System.out.println(c +" is the greatest number");
       }
    }
}
