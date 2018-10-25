package com.milo.modules;

/**
 * 版权所有(C) 2018 上海银路投资管理有限公司
 * 描述:
 * 作者: dumingliang
 * 创建日期: 2018-06-28
 * 修改记录:
 */
public class linearSearch {
    /**
     * 输入：整形数组a[0,n-1],正数k=a[i]。0<=i<n
     * 输出：i
     */
    public int linearSearch(int[] a, int k) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == k) return i;
        return -1;
    }
}
