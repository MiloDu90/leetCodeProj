package DataStru.ch02Stru;

/**
 * @author mingliang
 * @ClassName: TestRecursive
 * @Description: 测试斐波那契数列(这里用一句话描述这个类的作用)
 * @date 2020/10/2 22:48
 */
public class TestFebonacci {
    public static void main(String[] args) {
        //斐波那契数列 1，1，2，3，5，8，13
        int result = febonacci(50);
        System.out.println("===" + result);
    }

    //
    public static int febonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return febonacci(i - 1) + febonacci(i - 2);
        }
    }
}
