package com.milo.modules;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:在 R 行 C 列的矩阵上，我们从 (r0, c0) 面朝东面开始这里，网格的西北角位于第一行第一列，网格的东南角位于最后一行最后一列。
 * 现在，我们以顺时针按螺旋状行走，访问此网格中的每个位置。
 * 每当我们移动到网格的边界之外时，我们会继续在网格之外行走（但稍后可能会返回到网格边界）。
 * 最终，我们到过网格的所有 R * C 个空间。
 * 按照访问顺序返回表示网格位置的坐标列表。
 * 作者: dumingliang
 * 创建日期: 2018-09-14
 * 修改记录:
 */
public class SpiralMatrix3 {


    /**
     * 复杂度分析
     * 时间复杂度：O((\max(R, C))^2)O((max(R,C)))，潜在地，我们的行走需要螺旋式行进，直到我们向一个方向移动 RR，向另一个方向移动 CC，以便到达网格的每个单元格。
     * 空间复杂度：O(R * C)O(R∗C)，答案用去的空间。
     *
     * @param R
     * @param C
     * @param r0
     * @param c0
     * @return
     */
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};

        int[][] ans = new int[R * C][2];
        int t = 0;

        ans[t++] = new int[]{r0, c0};
        if (R * C == 1) return ans;

        for (int k = 1; k < 2 * (R + C); k += 2)
            for (int i = 0; i < 4; ++i) {  // i: direction index
                int dk = k + (i / 2);  // number of steps in this direction
                for (int j = 0; j < dk; ++j) {  // for each step in this direction...
                    // step in the i-th direction
                    r0 += dr[i];
                    c0 += dc[i];
                    if (0 <= r0 && r0 < R && 0 <= c0 && c0 < C) {
                        ans[t++] = new int[]{r0, c0};
                        if (t == R * C) return ans;
                    }
                }
            }

        throw null;
    }
}
