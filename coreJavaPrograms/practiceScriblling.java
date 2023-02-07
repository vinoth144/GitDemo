package coreJavaPrograms;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class practiceScriblling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome To Java class";
		char[] ch = s.toCharArray();
		Map<Character,Integer>mp = new TreeMap<Character,Integer>();
		for(int i =0; i<ch.length;i++){
		char c = ch[i];
		if(c>='a'&&c<='z'||c>='A'&&c<='z') {
		if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')){
		if(mp.containsKey(c)){
		Integer in = mp.get(ch[i]);
		mp.put(c,in+1);
		}
		else{
		mp.put(c,1);
		}
		}
		}
		}
		Set<Entry<Character,Integer>> ent = mp.entrySet();
		for(Entry<Character,Integer> en:ent){
		System.out.println(en);
		}
		
		
		//System.out.println("dinesh");
	
int i = 121;
int temp=i;
int rev=0;
while(i>0){
int n = i%10;
rev = (rev*10)+n;
i=i/10;
}
if(rev==temp){
System.out.println("no is a palindrome");
}else{
System .out.print ("no palindrome");
}

	}
}





