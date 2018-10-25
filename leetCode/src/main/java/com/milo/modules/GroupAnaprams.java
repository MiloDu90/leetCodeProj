package com.milo.modules;

import java.util.*;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * 作者: dumingliang
 * 创建日期: 2018-09-14
 * 修改记录:
 */
public class GroupAnaprams {


    /**
     * 维护一个映射 ans : {String -> List}，其中每个键 \text{K}K 是一个排序字符串，每个值是初始输入的字符串列表，
     * 排序后等于 K.
     * 时间复杂度：O(NK \log K)，其中 N是 strs 的长度，而 K 是 strs 中字符串的最大长度。
     * 当我们遍历每个字符串时，外部循环具有的复杂度为 O(N)。然后，我们在 O(K \log K) 的时间内对每个字符串排序。
     * 空间复杂度：O(NK)，排序存储在 ans 中的全部信息内容。
     *
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams01(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

    /**
     * 思路
     * 当且仅当它们的字符计数（每个字符的出现次数）相同时，两个字符串是字母异位词。
     * <p>
     * 算法
     * 我们可以将每个字符串s 转换为字符数count，由26个非负整数组成，表示a，b，c 的数量等。我们使用这些计数作为哈希映射的基础。
     *
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams02(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
