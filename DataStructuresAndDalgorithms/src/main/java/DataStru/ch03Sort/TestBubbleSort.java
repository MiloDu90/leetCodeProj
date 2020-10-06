package DataStru.ch03Sort;

import java.util.Arrays;

/**
 * @author mingliang
 * @ClassName: TestBubbleSort
 * @Description: 冒泡排序算法(这里用一句话描述这个类的作用)
 * @date 2020/10/5 21:23
 */
public class TestBubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 7, 4, 1, 9, 6, 5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序,
    public static void bubbleSort(int[] arr) {
        //控制共比较多少轮（外层）
        for (int i = 0; i < arr.length - 1; i++) {
            //控制比较的次数，每次比较完最大的值放在最后面
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
