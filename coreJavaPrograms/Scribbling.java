package coreJavaPrograms;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Scribbling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome To JAva class";

		char[] a = s.toCharArray();
		Map<Character,Integer> mp = new TreeMap <Character,Integer>();
		for(int i =0; i<a.length;i++){
		char c = a[i];
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
		if(mp.containsKey(c)){
		Integer in = mp.get(a[i]);
		mp.put(c,in+1);
		}
		else{
		mp.put(c,1);
		}
		}
		}
		Set<Entry<Character,Integer>> entryset = mp.entrySet();
		for(Entry<Character, Integer> en:entryset){
		System.out.println(en);
		}

		
	}

}
