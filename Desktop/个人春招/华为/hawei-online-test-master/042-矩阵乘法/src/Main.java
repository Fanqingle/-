import java.util.Scanner;

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
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            int[][] a = new int[x][y];
            int[][] b = new int[y][z];


            for(int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }


            for(int i = 0; i < y; i++) {
                for (int j = 0; j < z; j++) {
                    b[i][j] = scanner.nextInt();
                }
            }


            System.out.println(matrixMultiply(a, b));
        }

        scanner.close();
    }

    private static String matrixMultiply(int[][] a, int[][] b) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                int result = 0;
                for (int k = 0; k < a[0].length; k++) {
                    result += a[i][k] * b[k][j];
                }

                builder.append(result).append(' ');
            }
            builder.setCharAt(builder.length() - 1, '\n');
        }

        return builder.substring(0, builder.length() - 1);
    }
}
