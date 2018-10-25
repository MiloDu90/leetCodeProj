package com.milo.unit04_stock.StackInterface;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:
 * 作者: dumingliang
 * 创建日期: 2018-10-24
 * 修改记录:
 */
public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String message) {
        super(message);
    }
}
