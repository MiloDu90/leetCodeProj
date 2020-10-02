package DataStru.ch01Basic.searchMethod;

/**
 * @author mingliang
 * @ClassName: TestBinarySearch
 * @Description: 测试二分法查找, 前提条件是数组已经按照某一方式进行排序(这里用一句话描述这个类的作用)
 * @date 2020/10/2 15:49
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //目标元素
        int target =11;
        //目标所在下标
        int index = -1;
        //记录开始的位置
        int begin = 0;
        //记录结束的位置
        int end = arr.length - 1;
        //记录中间的位置,单双数均可，取数组结果的整数位
        int mid = (begin + end) / 2;
        //循环查找
        while (true) {
            //什么情况下没有这个元素
            //开始位置在结束位置之后或重合
            if (begin >= end) {
                index = -1;
                break;
            }
            //判断中间的这个元素是不是要查找的元素
            if (arr[mid] == target) {
                index = mid;
                break;
                //中间这个元素不是要找的元素
            } else {
                //判断中间这个元素是不是比目标元素大
                if (arr[mid] > target) {
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
        //打印目标元素的下标
        System.out.println("index:" + index);
    }
}
