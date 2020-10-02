package DataStru.ch01Basic;

import java.util.Arrays;

/**
 * @author mingliang
 * @ClassName: TestOpArray
 * @Description: 测试操作数据(这里用一句话描述这个类的作用)
 * @date 2020/10/2 14:55
 */
public class TestOpArray {

    public static void main(String[] args) {
        //解决数组长度不可变的问题
        int[] arr = new int[]{99, 98, 97};
        //快速常看数组中的元素
        System.out.println(Arrays.toString(arr));
        //要加入的目标元素
        int dst = 96;
        //创建一个新的数组，长度是原数组的长度+1
        int[] newArr = new int[arr.length + 1];
        //把原数组的元素全部复制到新数组
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //把目标元素放在新数组的最后
        newArr[arr.length] = dst;
        //新数组替换原数组
        arr = newArr;
        //快速常看数组中的元素
        System.out.println(Arrays.toString(arr));

        //快速删除数组
        //要删除的数组下标
        int rem = 3;
        //创建一个新的数组，长度是原数组的长度-1
        int[] newArr2 = new int[arr.length - 1];
        //复制原数组中除目标外的其他元素
        for (int i = 0; i < newArr2.length; i++) {
            if (i < rem) {//要删除的元素之前的元素
                newArr2[i] = arr[i];
            } else {//要删除的元素之后的元素
                newArr2[i] = arr[i + 1];
            }
        }
        //新数组替换原数组
        arr = newArr2;
        //快速常看数组中的元素
        System.out.println(Arrays.toString(arr));
    }
}
