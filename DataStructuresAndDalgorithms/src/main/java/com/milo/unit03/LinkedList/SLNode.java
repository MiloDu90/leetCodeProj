package com.DataStructuresAndalgorithms.unit03.LinkedList;

import com.DataStructuresAndalgorithms.unit03.Node;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:单链表结点定义
 * 作者: dumingliang
 * 创建日期: 2018-10-13
 * 修改记录:
 */
public class SLNode implements Node {
    private Object element;
    private SLNode next;

    public SLNode() {
        this(null, null);
    }

    public SLNode(Object element, SLNode next) {
        this.element = element;
        this.next = next;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
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
