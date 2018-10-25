package com.milo.unit04_stock.application;

import com.milo.unit04_stock.StackInterface.Stack;
import com.milo.unit04_stock.stackImpl.StackSLinked;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:
 * 作者: dumingliang
 * 创建日期: 2018-10-24
 * 修改记录:
 */
public class Application {

    /**
     * 输入：十进制正整数 i
     * 输出：打印相应八进制数
     *
     * @param i
     */
    public static void baseConversion(int i) {
        Stack s = new StackSLinked();
        while (i > 0) {
            s.push(i % 8 + "");
            i = i / 8;
        }
        while (!s.isEmpty()) System.out.print((String) s.pop());
    }

    /**
     * 括号匹配检测
     * 输入：字符串 str
     * 输出：boolean，匹配结果
     *
     * @param str
     * @return
     */
    public static boolean bracketMatch(String str) {
        Stack s = new StackSLinked();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    s.push(Integer.valueOf(c));
                    break;
                case '}':
                    if (!s.isEmpty() && ((Integer) s.pop()).intValue() == '{')
                        break;
                    else return false;
                case ']':
                    if (!s.isEmpty() && ((Integer) s.pop()).intValue() == '[')
                        break;
                    else return false;
                case ')':
                    if (!s.isEmpty() && ((Integer) s.pop()).intValue() == '(')
                        break;
                    else return false;
            }
        }
        if (s.isEmpty()) return true;
        else return false;
    }
}
