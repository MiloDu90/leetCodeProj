package com.milo.modules;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，
 * 你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * 作者: dumingliang
 * 创建日期: 2018-09-14
 * 修改记录:
 */
public class JewelsAndStones {

    public static void main(String[] args) {
        int result = numJewelsInStones("aA", "aAAbbbb");
        System.out.println("拥有的宝石数量num:" + result);
    }

    public static int numJewelsInStones(String j, String s) {
        int i = 0;
        for (String jj : j.split("")) {
            for (String ss : s.split("")) {
                if (ss.equals(jj)) {
                    i++;
                }
            }
        }
        return i;
    }
}
