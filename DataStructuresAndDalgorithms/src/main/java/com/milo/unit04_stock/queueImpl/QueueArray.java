package com.DataStructuresAndalgorithms.unit04_stock.queueImpl;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:Queue的顺序存储实现;
 * 以少使用一个存储单元的方案实现循环队列。
 * 作者: dumingliang
 * 创建日期: 2018-10-24
 * 修改记录:
 */
public class QueueArray implements Queue {

    private static final int CAP = 7;//队列默认大小
    private Object[] elements;  //数据元素数组
    private int capacity; //数组的大小 elements.length
    private int front;  //队首指针,指向队首
    private int rear;  //队尾指针,指向队尾后一个位置

    public QueueArray() {
        this(CAP);
    }

    public QueueArray(int cap) {
        capacity = cap + 1;
        elements = new Object[capacity];
        front = rear = 0;
    }

    @Override
    public int getSize() {
        return (rear - front + capacity) % capacity;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public void enqueue(Object e) {
        if (getSize() == capacity - 1) expandSpace();
        elements[rear] = e;
        rear = (rear + 1) % capacity;
    }

    private void expandSpace() {
        Object[] a = new Object[elements.length * 2];
        int i = front;
        int j = 0;
        while (i != rear) { //将从 front 开始到 rear 前一个存储单元的元素复制到新数组
            a[j++] = elements[i];
            i = (i + 1) % capacity;
        }
        elements = a;
        capacity = elements.length;
        front = 0;
        rear = j; //设置新的队首、队尾指针
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        if (isEmpty())
            throw new QueueEmptyException("错误：队列为空");
        Object obj = elements[front];
        elements[front] = null;
        front = (front + 1) % capacity;
        return obj;
    }

    @Override
    public Object peek() throws QueueEmptyException {
        if (isEmpty())
            throw new QueueEmptyException("错误：队列为空");
        return elements[front];
    }
}
