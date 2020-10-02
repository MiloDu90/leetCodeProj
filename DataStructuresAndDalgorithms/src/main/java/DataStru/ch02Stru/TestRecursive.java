package DataStru.ch02Stru;

/**
 * @author mingliang
 * @ClassName: TestRecursive
 * @Description: 测试递归函数(这里用一句话描述这个类的作用)
 * @date 2020/10/2 22:48
 */
public class TestRecursive {
    public static void main(String[] args) {


    }

    //stackOverFlower(栈溢出)
    public static void print(int i) {
        if (i > 0) {
            System.out.println(i);
            print(i - 1);
        }
    }
}
