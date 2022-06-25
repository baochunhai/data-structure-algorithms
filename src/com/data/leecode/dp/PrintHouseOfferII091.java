package com.data.leecode.dp;
/**
 * 如有一排房子，共 n 个，每个房子可以被粉刷成红色、蓝色或者绿色这三种颜色中的一种，你需要粉刷所有的房子并且使其相邻的两个房子颜色不能相同。
 *
 * 当然，因为市场上不同颜色油漆的价格不同，所以房子粉刷成不同颜色的花费成本也是不同的。每个房子粉刷成不同颜色的花费是以一个 n x 3 的正整数矩阵 costs 来表示的。
 *
 * 例如，costs[0][0] 表示第 0 号房子粉刷成红色的成本花费；costs[1][2] 表示第 1 号房子粉刷成绿色的花费，以此类推。
 *
 * 请计算出粉刷完所有房子最少的花费成本。
 *
 输入: costs = [[17,2,17],[16,16,5],[14,3,19]]
 输出: 10
 解释: 将 0 号房子粉刷成蓝色，1 号房子粉刷成绿色，2 号房子粉刷成蓝色。
      最少花费: 2 + 5 + 3 = 10。

 */
/**
 * @author baochunhai
 * @date 25/6/2022 下午4:19
 */
public class PrintHouseOfferII091 {


    /**
     * 动态规划题目
     * @param costs
     * @return
     */
    public int minCost(int[][] costs) {
        int len1 = costs.length;
        int len2 = costs[0].length;
        // 创建经典动态规划数组
        int[][] dp = new int[len1][len2];
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];
        // 根据题意，第i层粉刷房子有3种可能，红色成本为 i-1蓝，i-1绿中小的+cost[i][红]，分别计算3种情况，遍历整个数组，得到最后一层的花费
        for (int i = 1; i < len1; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + costs[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + costs[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + costs[i][2];
        }

        return Math.min(Math.min(dp[len1 - 1][0], dp[len1 - 1][1]), dp[len1 - 1][2]);
    }

}
