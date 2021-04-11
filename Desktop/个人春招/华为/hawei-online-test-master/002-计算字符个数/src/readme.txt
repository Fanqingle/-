计算字符个数
参与人数：31时间限制：1秒空间限制：32768K
通过比例：27.27%
最佳记录：0 ms|8460K （来自  kd丹妮儿）
 算法知识视频讲解
题目描述

写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
输入描述:

输入一个有字母和数字以及空格组成的字符串，和一个字符。


输出描述:

输出输入字符串中含有该字符的个数。

输入例子:

ABCDEF
A

输出例子:

1

public class Test{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//字符流
        String scannerCopy = scanner.toLowCase;
        Char input = scanner.nextLine();
        Char inputCopy = input.toLowCase;
        int count = 0;
        for(int i = 0,i< scanner.length(),i++;){
            if(scanner.charAt(i)==input){
            count++;
            }
        }
        System.out.println(count);
    }
}