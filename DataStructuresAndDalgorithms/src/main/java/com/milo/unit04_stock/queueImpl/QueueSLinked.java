package com.milo.unit04_stock.queueImpl;

import com.milo.unit03.LinkedList.SLNode;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:Queue的链式存储实现
 * 作者: dumingliang
 * 创建日期: 2018-10-24
 * 修改记录:
 */
public class QueueSLinked implements Queue {

    private SLNode front;
    private SLNode rear;
    private int size;

    public QueueSLinked() {
        front = new SLNode();
        rear = front;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(Object e) {
        SLNode p = new SLNode(e, null);
        rear.setNext(p);
        rear = p;
        size++;
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        if (size < 1)
            throw new QueueEmptyException("错误：队列为空");
        SLNode p = front.getNext();
        front.setNext(p.getNext());
        size--;
        if (size < 1) rear = front; //如果队列为空,rear 指向头结点
        return p.getData();
    }

    @Override
    public Object peek() throws QueueEmptyException {
        if (size < 1)
            throw new QueueEmptyException("错误：队列为空");
        return front.getNext().getData();
    }
}
