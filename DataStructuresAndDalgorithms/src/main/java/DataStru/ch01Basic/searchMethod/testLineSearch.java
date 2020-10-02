package DataStru.ch01Basic.searchMethod;

/**
 * @author mingliang
 * @ClassName: testLineSearch
 * @Description: 线性查找(这里用一句话描述这个类的作用)
 * @date 2020/10/2 15:45
 */
public class testLineSearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //目标元素
        int target = 10;
        //目标所在下标
        int index = -1;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        //打印目标元素的下标
        System.out.println("index:" + index);
    }
}
