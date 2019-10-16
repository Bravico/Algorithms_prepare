package leetcode;

/**
 * 
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @ClassName: Solution121 
 * @Description: TODO
 * @author: Yel
 * @date: Oct 16, 2019 10:39:54 AM
 */
public class Solution121 {
	public int maxProfit(int[] prices) {
		int buy_price = Integer.MAX_VALUE;
		int earn_price = 0;
		for (int i = 0; i < prices.length; i++) {
			if (buy_price > prices[i]) {
				buy_price = prices[i];
			}
			if (earn_price < (prices[i] - buy_price)) {
				earn_price = (prices[i] - buy_price);
			}
		}
		return earn_price;
	}
}
