package trapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * shows trapping in Java
 * 
 * @author Yel
 *
 */
public class IteratorTrapper {
/**
 * 读操作和删除操作同时进行，出现java.util.ConcurrentModificationException问题
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		for (String temp : a) {
			if ("2".equals(temp)) {
				a.remove(temp);
			}
		}
		for (String temp : a) {
			System.out.println(temp);
		}
		
		//right answer
/*		Iterator<String> it = a.iterator(); while(it.hasNext()){
			String temp = it.next(); 
			if(删除元素的条件){
			             it.remove();
			          }
			}*/
	}

}
