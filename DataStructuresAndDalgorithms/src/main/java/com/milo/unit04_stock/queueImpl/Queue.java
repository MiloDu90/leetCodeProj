package com.milo.unit04_stock.queueImpl;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:
 * 作者: dumingliang
 * 创建日期: 2018-10-24
 * 修改记录:
 */
public interface Queue {
    //返回队列的大小
    public int getSize();

    //判断队列是否为空
    public boolean isEmpty();

    //数据元素 e 入队
    public void enqueue(Object e);

    //队首元素出队
    public Object dequeue() throws QueueEmptyException;

    //取队首元素
    public Object peek() throws QueueEmptyException;
}
