import java.util.Scanner;

public class Test {
    /**
     * Author: 王俊超
     * Date: 2015-12-24 20:37
     * Declaration: All Rights Reserved !!!
     * 输入描述:
     *     输入说明：
     *     1、第一个矩阵的行数
     *     2、第一个矩阵的列数和第二个矩阵的行数
     *     3、第二个矩阵的列数
     *     4、第一个矩阵的值
     *     5、第二个矩阵的值
     * 输出描述:
     *     输出两个矩阵相乘的结果
     * 输入例子:
     *     2
     *     2
     *     2
     *     3 8
     *     8 0
     *     9 0
     *     18 9
     * 输出例子:
     *     171 72
     *     72 0
     *
     */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
            while (scanner.hasNext()) {
                //int x = scanner.nextInt();

                int[] a = new int[2];
                int[] b = new int[2];

                for(int i = 0; i < 2; i++) {
                        a[i] = scanner.nextInt();
                }

                for(int i = 0; i < 2; i++) {
                        b[i] = scanner.nextInt();
                }

                if(b[0]+b[1]>=a[0] || a[0]+a[1]>=b[0]) {
                    System.out.println(Math.min(b[0]+b[1]+a[1],a[0]+a[1]+b[1]));
                }
                if(b[0]+b[1]< a[0] || a[0]+a[1]<b[0]) {
                    System.out.println(Math.min(a[0]+a[1],b[0]+b[1]));
                }

//                if(b[0]+b[1]>=a[0]) {
//                    System.out.println(b[0]+b[1]+a[1]);
//                }
//                if(b[0]+b[1]< a[0]) {
//                    System.out.println(a[0]+a[1]);
//                }
//                if(a[0]+a[1]>=b[0]) {
//                    System.out.println(a[0]+a[1]+b[1]);
//                }
//                if(a[0]+a[1]<b[0]) {
//                    System.out.println(b[0]+b[1]);
//                }

            }
            scanner.close();
        }

}
