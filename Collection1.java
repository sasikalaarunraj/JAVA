package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection1 {
	public static void countcharacter() {
		String s="sasikala";
		HashMap<Character,Integer>hm=new HashMap<>();
		System.out.println(hm);
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		Set<Map.Entry<Character, Integer>>se=hm.entrySet();
		for(Map.Entry<Character, Integer>entry:se) {
			if(entry.getValue()!=1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}
	public static void countword() {
		String s="sasikala is a good girl and sasikala is also a good devil";
		HashMap<String,Integer>hm=new HashMap<>();
		System.out.println(hm);
		String[] str=s.split(" ");
		for(String c:str) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		Set <Map.Entry<String,Integer>> se=hm.entrySet();
		for(Map.Entry<String, Integer>entry:se) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey()+ " " +entry.getValue());
			}
		}
	}
	public static void main(String[] args) {
		countword();
		countcharacter();
		
	}

}
