package com.DataStructuresAndalgorithms.unit04_stock.stackImpl;

import com.DataStructuresAndalgorithms.unit04_stock.StackInterface.Stack;
import com.DataStructuresAndalgorithms.unit04_stock.StackInterface.StackEmptyException;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:Stack的顺序存储实现
 * 作者: dumingliang
 * 创建日期: 2018-10-24
 * 修改记录:
 */
public class StackArray implements Stack {
    private final int LEN = 8;  //数组的默认大小
    private Object[] elements;  //数据元素数组
    private int top; //栈顶指针

    public StackArray() {
        top = -1;
        elements = new Object[LEN];
    }

    @Override
    public int getSize() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public void push(Object e) {
        if (getSize() >= elements.length) expandSpace();
        elements[++top] = e;
    }

    private void expandSpace() {
        Object[] a = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++)
            a[i] = elements[i];
        elements = a;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (getSize() < 1)
            throw new StackEmptyException("错误，堆栈为空。");
        Object obj = elements[top];
        elements[top--] = null;
        return obj;
    }

    @Override
    public Object peek() throws StackEmptyException {
        if (getSize() < 1)
            throw new StackEmptyException("错误，堆栈为空。");
        return elements[top];
    }
}
