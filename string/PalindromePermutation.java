package string;

import java.util.Scanner;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.youtube.com/watch?v=Pp5hdsNdqOU
		Scanner sc=new Scanner(System.in);
		//String s=sc.next();
		String s="aabbccdd";
		s="ab";
		int[] charCnt = new int[128];
		for (int i = 0; i < s.length(); i++) {
			charCnt[s.charAt(i)]++;
		}
		int cnt=0;
		for (int i = 0; i <128; i++) {
			cnt+=charCnt[i]%2;
		}
		if(cnt<=1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
