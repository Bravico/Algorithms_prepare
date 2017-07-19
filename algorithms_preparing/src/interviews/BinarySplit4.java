package interviews;

import java.util.ArrayList;

/**
 * 给定一串数字 判断是否存在这三个元素，它们将数字串分为四个子串，其中每个子串的数字之和均相同(该3个元素不纳入计算) 
 * 要求时间复杂度和空间复杂度均不能超过O(n)
 * @author Yel
 *
 */
public class BinarySplit4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,3,5,2,1,2,3,2};
		BinarySplit4 binarySplit4 = new BinarySplit4();
		int b1 = binarySplit4.sumSplit(a,0,a.length-1);
		
		int b2 = binarySplit4.sumSplit(a,0,b1);
		int b3 = binarySplit4.sumSplit(a,b1+1,a.length-1);
		System.out.println("b1: "+b1+" b2:"+b2+" b3:"+b3);
	}
	public int sumSplit(int[] a, int start, int end){
		int lsum=a[start], rsum=a[end];
		int i=start,j=end;
		while(i<j-1){
			if(lsum<rsum) {
				i++;
				lsum +=a[i];
			}else if(lsum>rsum){
				rsum +=a[j];
				j--;
			}else{
				i++;j--;
				lsum +=a[i];
				rsum +=a[j];
			}
		}
		if(i==j-1 && lsum==rsum) return i; //find the result
		else return 0; //not found
	}

}
