import java.util.Scanner;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class Test{

    public static void main(String[] args){
        //字符流
        Scanner scanner = new Scanner(System.in);

//        String input = scanner.nextLine();
//        String chStr = scanner.nextLine();
//        System.out.println(count(input,chStr));
//        scanner.close();

        while(scanner.hasNext()){
            String input = scanner.nextLine();
            String chStr = scanner.nextLine();
            System.out.println(count(input,chStr));
        }
    }

    public static int count(String input, String chStr){
        int counts = 0;
        char ch = chStr.charAt(0);
        for(int i = 0;i< input.length();i++){
            if(input.charAt(i)==toLowerCase(ch)||input.charAt(i)==toUpperCase(ch)){
                counts++;
            }
        }
        return counts;
    }
}