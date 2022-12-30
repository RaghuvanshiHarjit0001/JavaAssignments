import java.util.Scanner;

public class OddNumberSum {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a Number");
            int value = scanner.nextInt();
            int sum = 0;
            for(int i = 1; i <= value; i++){
                if(i % 2 != 0){
                    if(i==value || i == (value-1)){
                        System.out.print(i);
                    }
                    else {
                        System.out.print(i+",");
                    }

                }
            }
            System.out.println();
            for(int i = 1; i <= value; i++){
                if(i % 2 != 0){
                    if(i==value || i == (value-1)){
                        sum += i;
                        System.out.print(i+" = "+ sum);
                    }
                    else {
                        sum += i;
                        System.out.print(i+" + ");
                    }

                }
            }
        }

}
