package com.DataStructuresAndalgorithms.unit03.linearList;

import com.DataStructuresAndalgorithms.unit03.Strategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:线性表的数组实现
 * 作者: dumingliang
 * 创建日期: 2018-10-13
 * 修改记录:
 */
public class ListArray implements List {
    private final int LEN = 8;//数组默认大小
    private Strategy strategy;//数据元素比较策略
    private int size;//线性表中数据元素的个数
    private Object[] elements;//数据元素数组

    //构造方法
    public ListArray() {
    }

    public ListArray(Strategy strategy) {
        this.strategy = strategy;
        size = 0;
        elements = new Object[LEN];
    }

    //返回线性表的大小，即数据元素的个数。
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (strategy.equal(o, elements[i])) return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        int i = indexOf(o);
        if (i < 0) return false;
        remove(i);
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("错误，指定的序号越界。");
        }
        return elements[index];
    }

    @Override
    public Object set(int index, Object element) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("错误，指定的序号越界。");
        }
        Object obj = elements[index];
        elements[index] = element;
        return obj;
    }

    @Override
    public void add(int index, Object element) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("错误，指定的插入序号越界。");
        }
        if (size >= elements.length) {
            expandSpace();
        }
        for (int j = size; j > index; j--) {
            elements[j] = elements[j - 1];
        }
        elements[index] = element;
        size++;
        return;
    }

    private void expandSpace() {
        Object[] a = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            a[i] = elements[i];
        }
        elements = a;
    }

    //将数据元素e插入到元素obj之前
    public boolean insertBefore(Object obj, Object e) {
        int i = indexOf(obj);
        if (i < 0) return false;
        add(i, e);
        return true;
    }

    //将数据元素e插入到元素obj之后
    public boolean insertAfter(Object obj, Object e) {
        int i = indexOf(obj);
        if (i < 0) return false;
        add(i + 1, e);
        return true;
    }

    @Override
    public Object remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("错误，指定的删除序号越界。");
        Object obj = elements[index];
        for (int j = index; j < size - 1; j++) {
            elements[j] = elements[j + 1];
        }
        elements[--size] = null;
        return obj;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (strategy.equal(o, elements[i])) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
