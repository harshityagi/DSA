package string;

import java.util.HashMap;
import java.util.Scanner;

public class KAnagram {
	static String ss;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.youtube.com/watch?v=VyQbl13RGiw
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int k=s.nextInt();
		System.out.println(areKAnagram(s1,s2,k));
		System.out.println(ss);
		s.close();
	}

	private static boolean areKAnagram(String s1, String s2, int k) {
		// TODO Auto-generated method stub
		//String ss="0";
		if(s1.length()!=s2.length()) {
			ss="0";
			return false;
		}
		HashMap<Character, Integer> m = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char c=s1.charAt(i);
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		for (int i = 0; i < s2.length(); i++) {
			char ch= s2.charAt(i);
			if(m.getOrDefault(ch,0)>0) {
				m.put(ch,m.get(ch)-1);
			}
		}
		int count=0;
		for(char ch: m.keySet()) {
			count+=m.get(ch);
		}
		if(count>k) {
			ss="0";
			return false;
		}else {
			ss="1";
			return true;
		}
	}

	

}
