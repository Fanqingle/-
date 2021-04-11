import java.util.Scanner;

public class Question1 {

    public static void main(String[] args){
        //系统输入
        Scanner scanner = new Scanner(System.in);
        //输入下一行
        String input = scanner.nextLine();
        //空格分割字符串w
        String[] words = input.split(" ");
        //打印倒数第一个单词长度
        System.out.println(words[words.length - 1].length());

    }
}
