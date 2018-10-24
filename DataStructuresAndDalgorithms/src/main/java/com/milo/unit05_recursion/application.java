package com.milo.unit05_recursion;

/**
 * @author mingliang
 * @ClassName: application
 * @Description: 递归算法的应用demo(这里用一句话描述这个类的作用)
 * @date 2018/10/24 22:42
 */
public class application {

    /**
     * 计算一个整数的阶乘
     *
     * @param n
     * @return
     */
    public static int factirial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factirial(n - 1);
        }
    }

    /**
     * 计算以x为底的n次幂
     *
     * @param x
     * @param n
     * @return
     */
    public static int power(int x, int n) {
        int y;
        if (n == 0) {
            y = 1;
        } else {
            y = power(x, n / 2);
            y = y * y;
            if (n % 2 == 1) {
                y = y * x;
            }
        }
        return y;
    }

    /**
     * n 阶汉诺塔问题
     * 假设有 X、Y、Z 三个塔座，初始时有 n 个大小不一的盘子按照从小到大的次序放在塔座 X 上。
     * 现在要求将塔座 X 上的所有盘子移动到塔座 Z 上并保持原来的顺序，
     * 在移动过程中要满足以下要求：在塔座之间一次只能移动一个盘子并且任何时候大盘子都不能放到小盘子上。
     *
     * @param n
     * @param x
     * @param y
     * @param z
     */
    public static void hanio(int n, char x, char y, char z) {
        if (n == 1) {
            move(x, n, z);
        } else {
            hanio(n - 1, x, z, y);
            move(x, n, z);
            hanio(n - 1, y, x, z);
        }
    }

    private static void move(char x, int n, char y) {
        System.out.println("Move " + n + " from " + x + " to " + y);
    }
}
