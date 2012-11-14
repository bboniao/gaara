/**
 * 
 */
package self.collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * @author root
 *
 */
public class TreeMapTest {

	public static void main(String[] args) {
		TreeMapTest tt = new TreeMapTest();
		tt.test();
	}
	
	public void test(){
		T t1 = new T(2, 5);
		T t2 = new T(1, 3);
		T t3 = new T(3, 4);
		T t4 = new T(5, 2);
		T t5 = new T(4, 1);
		Map<Integer,T> map = new TreeMap<Integer,T>();
		map.put(t1.getSort(), t1);
		map.put(t2.getSort(), t2);
		map.put(t3.getSort(), t3);
		map.put(t4.getSort(), t4);
		map.put(t5.getSort(), t5);
		
		for(Entry<Integer,T> e : map.entrySet()){
			System.out.println(e.getValue().getId()+","+e.getValue().getSort());
		}
	}
	
	public class T{
		private int id;
		private int sort;
		/**
		 * @param id
		 * @param sort
		 */
		public T(int id, int sort) {
			super();
			this.id = id;
			this.sort = sort;
		}
		/** 
		 * 获取id 
		 * @return id id 
		 */
		public int getId() {
			return id;
		}
		/** 
		 * 获取sort 
		 * @return sort sort 
		 */
		public int getSort() {
			return sort;
		}
		
	}
}
