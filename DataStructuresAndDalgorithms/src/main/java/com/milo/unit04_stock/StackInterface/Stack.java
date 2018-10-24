package com.DataStructuresAndalgorithms.unit04_stock.StackInterface;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:
 * 作者: dumingliang
 * 创建日期: 2018-10-24
 * 修改记录:
 */
public interface Stack {
    //返回堆栈的大小
    public int getSize();

    //判断堆栈是否为空
    public boolean isEmpty();

    //数据元素 e 入栈
    public void push(Object e);

    //栈顶元素出栈
    public Object pop() throws StackEmptyException;

    //取栈顶元素
    public Object peek() throws StackEmptyException;
}
