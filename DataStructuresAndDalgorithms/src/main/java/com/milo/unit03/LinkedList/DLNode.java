package com.DataStructuresAndalgorithms.unit03.LinkedList;

import com.DataStructuresAndalgorithms.unit03.Node;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:双向链表结点定义
 * 作者: dumingliang
 * 创建日期: 2018-10-13
 * 修改记录:
 */
public class DLNode implements Node {
    private Object element;
    private DLNode pre;
    private DLNode next;

    public DLNode() {
        this(null, null, null);
    }

    public DLNode(Object element, DLNode pre, DLNode next) {
        this.element = element;
        this.pre = pre;
        this.next = next;
    }

    public DLNode getPre() {
        return pre;
    }

    public void setPre(DLNode pre) {
        this.pre = pre;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }

    @Override
    public Object getData() {
        return element;
    }

    @Override
    public void setData(Object object) {
        element = object;
    }
}
