package algorithm;

import java.util.Scanner;

/**
 * Created by zhujia on 2018/5/20.
 1
 6 2
 10 7 3
 13 11 8 4
 15 14 12 9 5
 */
public class PrintTriangle {
    public static void main(String[] args) {
        int n;
        System.out.println("请输入数字n");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {//控制行数
            for (int j = 0; j <= i; j++) {//控制列数
                int value = j+1;
                for (int k = 0; k < i-j; k++) {//控制输出数字
                    value = value + (n-k);
                }
                System.out.print(value+" ");

            }
            System.out.println();//打印换行
        }
    }
}
