/**
 * 
 */
package self.string;

import java.util.StringTokenizer;

/**
 * @author root
 *
 */
public class Split {
	public static String[] getStr1(String str,String symobl){
		return str.split(symobl);
	}
	
	public static String[] getStr2(String str,String symobl){
		StringTokenizer st = new StringTokenizer(str,symobl);
		String[] items = new String[st.countTokens()];
		int count=0;
		while(st.hasMoreTokens()){
			items[count] = st.nextToken();
			count++;
		}
		return items;
	}
	
	public static String[] getStr3(String str,String symobl){
		String[] items = new String[26];
		int count=0;
		while(true){
			String splitStr = null;
			int j=str.indexOf(symobl);
			if(j<0)break;
			splitStr = str.substring(0,j);
			items[count] = splitStr;
			str = str.substring(j+1);
			count++;
		}
		return items;
	}
}
