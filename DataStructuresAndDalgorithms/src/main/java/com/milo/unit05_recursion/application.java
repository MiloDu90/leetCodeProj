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

    /**
     * 每个布尔量有真和假两种取值，分别对应 1，0。对于n个布尔量有 2 n 种组合，每一种均为n位。
     * 基本项：如果 n 为 1，则只需要输出 0 和 1 即可。
     * 递归项：n个布尔量的 2 n 种所有不同的组合可以看成是 2*2 n-1 种组合，其中 2 n-1 种组合是n-1 个布尔量的所有组合，
     * 每种组合包含n-1 位。这样n个布尔变量的所有组合是在n-1 个布尔变量的每种组合的基础上加上 1 或 0 而分别得到的结果。
     * 输入：正整数 n
     * 输出：n 位布尔量的所有组合
     *
     * @param b
     * @param n
     */
    public static void coding(int[] b, int n) {
        if (n == 0) {
            b[n] = 0;
            outBn(b);
            b[n] = 1;
            outBn(b);
        } else {
            b[n] = 0;
            coding(b, n - 1);
            b[n] = 1;
            coding(b, n - 1);
        }
    }

    private static void outBn(int[] b) {
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i]);
        System.out.println();
    }

}
