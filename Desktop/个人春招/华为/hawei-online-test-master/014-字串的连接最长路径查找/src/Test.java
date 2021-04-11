import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//输入描述:输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
//输出描述:数据输出n行，输出结果为按照字典序排列的字符串。
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num  = Integer.parseInt(scanner.nextLine());
            List<String> list = new ArrayList<>(num);

            StringBuilder builder = new StringBuilder();

            while (--num >= 0){
                list.add(scanner.nextLine());
            }

            Collections.sort(list);

            for (String n:list){
                builder.append(n).append('\n');
            }
            System.out.println(builder);
        }
        scanner.close();
    }
}
