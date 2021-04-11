import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countNum(input));
    }

    //不同字符的个数
    public static int countNum(String str){

        //字符在ACSII码范围内(0~127)

        //StringBuilder builder = new StringBuilder(128);
        HashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        return set.size();
    }
}
