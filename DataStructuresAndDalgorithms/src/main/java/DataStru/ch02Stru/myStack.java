package DataStru.ch02Stru;

/**
 * @author mingliang
 * @ClassName: myStack
 * @Description: 栈，先进后出结构(这里用一句话描述这个类的作用)
 * @date 2020/10/2 16:16
 */
public class myStack {
    //栈的底层我们用数组来存储数据
    int[] elements;

    public myStack() {
        elements = new int[0];
    }

    //压入元素,放在数组的最后面
    public void push(int element) {
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

    //取出栈顶元素
    public int pop() {
        //栈中没有元素
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        //取出数组的最后一个元素
        int element = elements[elements.length - 1];
        //创建一个新数组
        int[] newArr = new int[elements.length - 1];
        //原数组中除最后一个元素其他元素都放入新数组中
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        //替换数组
        elements = newArr;
        //返回栈顶元素
        return element;
    }

    //查看栈顶元素
    public int peek() {
        //栈中没有元素
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length - 1];
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
