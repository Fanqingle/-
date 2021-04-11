import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Author: 王俊超
 * Date: 2015-12-22 19:10
 * Declaration: All Rights Reserved !!!
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 读取输入的数字数
            int num = scanner.nextInt();
            // 存放输入的数字,Treeset同时具有排序和去重功能
            Set<Integer> set = new TreeSet<>();
            //循环num次，num = 6: 5,4,3,2,1,0 或者 while ((num--) > 0) set.add(scanner.nextInt())
            while ((--num) >= 0) {
                set.add(scanner.nextInt());
            }

            System.out.print(setToString(set));
        }
    }

    private static String setToString(Set<Integer> set) {
        StringBuilder builder = new StringBuilder(128);
        for (Integer i : set) {
            builder.append(i).append(" ");
//            builder.append(i).append("\n");换行        `1
        }

        return builder.toString();
    }
}

/**
 * TreeSet简介
 * TreeSet 是一个有序的集合，它的作用是提供有序的Set集合。它继承于AbstractSet抽象类，实现了NavigableSet<E>, Cloneable, java.io.Serializable接口。
 * TreeSet 继承于AbstractSet，所以它是一个Set集合，具有Set的属性和方法。
 * TreeSet 实现了NavigableSet接口，意味着它支持一系列的导航方法。比如查找与指定目标最匹配项。
 * TreeSet 实现了Cloneable接口，意味着它能被克隆。
 * TreeSet 实现了java.io.Serializable接口，意味着它支持序列化。
 * TreeSet是基于TreeMap实现的。TreeSet中的元素支持2种排序方式：自然排序 或者 根据创建TreeSet 时提供的 Comparator 进行排序。这取决于使用的构造方法。
 * TreeSet为基本操作（add、remove 和 contains）提供受保证的 log(n) 时间开销。
 * 另外，TreeSet是非同步的。 它的iterator 方法返回的迭代器是fail-fast的
 */
