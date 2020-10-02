package DataStru.ch01Basic.arrays;

import java.util.Arrays;

/**
 * @author mingliang
 * @ClassName: Myarray
 * @Description: 面向对象的数组，封装操作方法(这里用一句话描述这个类的作用)
 * @date 2020/10/2 15:29
 */
public class MyArray {

    /**
     * 用以存储数据的数组
     */
    private int[] elements;

    public MyArray() {
        elements = new int[0];
    }

    /**
     * 获取数组长度的方法
     */
    public int size() {
        return elements.length;
    }

    /**
     * 往数组的末尾添加一个元素
     */
    public void add(int element) {
        //创建一个新的数组，长度是原数组的长度+1
        int[] newArr = new int[elements.length + 1];
        //把原数组的元素全部复制到新数组
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //把目标元素放在新数组的最后
        newArr[elements.length] = element;
        //新数组替换原数组
        elements = newArr;
    }

    /**
     * 打印所有元素到控制台
     */
    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    /**
     * 删除数组中的元素
     */
    public void delete(int index) {
        //判断数组下表越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        //创建一个新的数组，长度是原数组的长度-1
        int[] newArr = new int[elements.length - 1];
        //复制原数组中除目标外的其他元素
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {//要删除的元素之前的元素
                newArr[i] = elements[i];
            } else {//要删除的元素之后的元素
                newArr[i] = elements[i + 1];
            }
        }
        //新数组替换原数组
        elements = newArr;
    }

    /**
     * 获取某个元素
     */
    public int get(int index) {
        return elements[index];
    }

    /**
     * 插入一个元素到指定位置
     */
    public void insert(int index, int element) {
        //创建一个新的数组，长度是原数组的长度+1
        int[] newArr = new int[elements.length + 1];
        //把原数组的元素全部复制到新数组
        for (int i = 0; i < elements.length; i++) {
            if (i < index) {//目标元素之前的元素
                newArr[i] = elements[i];
            } else {//目标元素之后的元素
                newArr[i + 1] = elements[i];
            }
        }
        //把目标元素放在新数组指定位置
        newArr[index] = element;
        //新数组替换原数组
        elements = newArr;
    }

    /**
     * 线性查找
     *
     * @param target 目标元素
     * @return 返回目标元素的下标
     */
    public int searchLine(int target) {
        //遍历数组
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }


    /**
     * 二分法查找
     *
     * @param target 目标元素
     * @return 返回目标元素的下标
     */
    public int binarySeach(int target) {
        //目标所在下标
        int index = -1;
        //记录开始的位置
        int begin = 0;
        //记录结束的位置
        int end = elements.length - 1;
        //记录中间的位置,单双数均可，取数组结果的整数位
        int mid = (begin + end) / 2;
        //循环查找
        while (true) {
            //什么情况下没有这个元素
            //开始位置在结束位置之后或重合
            if (begin >= end) {
                return -1;
            }
            //判断中间的这个元素是不是要查找的元素
            if (elements[mid] == target) {
                return mid;
                //中间这个元素不是要找的元素
            } else {
                //判断中间这个元素是不是比目标元素大
                if (elements[mid] > target) {
                    //把结束位置挑中到中间位置的前一个位置
                    end = mid - 1;
                    //中间元素比目标元素小
                } else {
                    //把开始位置挑中到中间位置的前一个位置
                    begin = mid + 1;
                }
                //取出新的中间位置
                mid = (begin + end) / 2;
            }
        }
    }
}
