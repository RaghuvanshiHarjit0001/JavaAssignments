import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine().toLowerCase();
        if(value.equals("january")  || value.equals("march") ||value.equals("may")||value.equals("july")
        ||value.equals("august")|| value.equals("october") || value.equals("december")){
            System.out.println("number of days = " + 31);
        }
        else if(value.equals("february")){
            System.out.println("number of days = " + 28);
        }else {
            System.out.println("number of days = " + 30);
        }
    }
}
