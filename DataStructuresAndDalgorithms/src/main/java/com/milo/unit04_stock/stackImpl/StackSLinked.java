package com.milo.unit04_stock.stackImpl;

import com.milo.unit03.LinkedList.SLNode;
import com.milo.unit04_stock.StackInterface.Stack;
import com.milo.unit04_stock.StackInterface.StackEmptyException;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:Stack的链式存储实现
 * 作者: dumingliang
 * 创建日期: 2018-10-24
 * 修改记录:
 */
public class StackSLinked implements Stack {
    private SLNode top;  //链表首结点引用
    private int size;  //栈的大小

    public StackSLinked() {
        top = null;
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
    public void push(Object e) {
        SLNode q = new SLNode(e, top);
        top = q;
        size++;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (size < 1)
            throw new StackEmptyException("错误，堆栈为空。");
        Object obj = top.getData();
        top = top.getNext();
        size--;
        return obj;
    }

    @Override
    public Object peek() throws StackEmptyException {
        if (size < 1)
            throw new StackEmptyException("错误，堆栈为空。");
        return top.getData();
    }
}
