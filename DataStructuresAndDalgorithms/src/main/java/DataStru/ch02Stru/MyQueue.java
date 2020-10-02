package DataStru.ch02Stru;

/**
 * @author mingliang
 * @ClassName: MyQueue
 * @Description: 队列，先进先出(这里用一句话描述这个类的作用)
 * @date 2020/10/2 17:40
 */
public class MyQueue {
    int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    //入队
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

    //出队
    public int poll() {
        //队列中没有元素
        if (elements.length == 0) {
            throw new RuntimeException("queue is empty");
        }
        //取出数组的第一个元素
        int element = elements[0];
        //创建一个新数组
        int[] newArr = new int[elements.length - 1];
        //原数组中除第一个元素其他元素都放入新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i + 1];
        }
        //替换数组
        elements = newArr;
        //返回栈顶元素
        return element;
    }

    //判断数组是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
