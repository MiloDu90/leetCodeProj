package DataStru.ch02Stru;

/**
 * @author mingliang
 * @ClassName: TestHanoi
 * @Description: 测试汉诺塔问题，三根柱子，将第一根柱子上的圆圈都挪到第三根柱子上(这里用一句话描述这个类的作用)
 * @date 2020/10/2 22:58
 */
public class TestHanoi {

    public static void main(String[] args) {
        hanoi(6, 'A', 'B', 'C');
    }

    /**
     * @param n    共有n个盘子
     * @param from 开始的柱子
     * @param in   中间的柱子
     * @param to   目标柱子
     */
    public static void hanoi(int n, char from, char in, char to) {
        if (n == 1) {
            System.out.println("第1个盘子从" + from + "移动到" + to);
        } else {
            //移动上面所有的盘子到中间位置
            hanoi(n - 1, from, to, in);
            //移动下面的盘子
            System.out.println("第" + n + "个盘子从" + from + "移动到" + to);
            //把上面所有的盘子从中间位置移动到目标位置
            hanoi(n - 1, in, from, to);
        }
    }
}
