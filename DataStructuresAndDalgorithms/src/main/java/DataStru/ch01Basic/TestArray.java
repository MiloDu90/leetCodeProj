package DataStru.ch01Basic;

/**
 * @author mingliang
 * @ClassName: TestArray
 * @Description: 测试数组(这里用一句话描述这个类的作用)
 * @date 2020/10/2 14:49
 */
public class TestArray {

    public static void main(String[] args) {
        //创建数组
        int[] arr1 = new int[3];
        //获取数组长度
        int length1 = arr1.length;
        System.out.println("arr1的数组长度为：" + length1);
        //访问数组中的元素
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println("arr1[0]=" + arr1[0]);
        //创建数组的同时为数组中的元素赋值
        int[] arr2 = new int[]{10, 20, 30, 40, 50};
        //获取数组长度
        System.out.println("arr2的数组长度为：" + arr2.length);
    }
}
