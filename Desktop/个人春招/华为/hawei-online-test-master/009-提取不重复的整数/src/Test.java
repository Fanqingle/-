import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(extractNumber(input));
    }

    public static String extractNumber(String str){
        StringBuilder builder = new StringBuilder(128);
        HashSet<Character> set = new LinkedHashSet<>();
        for (int i = str.length()-1; i >=  0; i--) {
            set.add(str.charAt(i));
        }

        for (Character c: set){
            builder.append(c);
        }


        if(builder.charAt(0)=='0'){
            return builder.substring(1,builder.length());
        }
        return builder.toString();
    }
}
