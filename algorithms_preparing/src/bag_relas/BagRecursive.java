package bag_relas;

public class BagRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int[] bs = new int[50];// 背包元素

	/**
	 * 假设物品按从小到大排列，
	 * 1.如果需要选择的重量s为0， 则成功使用背包贪心算法
	 * 2.如果当前需要的重量小于bs[1],则失败
	 * 3.若对象为bs[0]，则说明未找到合适的方法，失败
	 * @param s
	 *            当前需要重量
	 * @param m
	 *            第m个元素
	 * @return
	 */
	private static boolean recurBag(int s, int m) {
		int s1; // 当前重量
		boolean b; // 是否完成
		if (s == 0)
			return true;
		else if (s < bs[1] || m == 0)
			return false;
		else {
			do {
				s1 = bs[m];
				m--;
				b = recurBag(s - s1, m);
			} while (m != 0 && (!b));
			if (!b)
				return false;
			else
				return true;
		}
	}
}
