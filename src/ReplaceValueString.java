import java.util.Scanner;

public class ReplaceValueString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println(str);
        System.out.println(str.replace("dog","cat"));

    }
}
