package math;

import java.util.Scanner;

public class HCFof2NUMs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		int n2=s.nextInt();
		int hcf=1;
		if(n2<n) {
			int hold=n;
			n=n2;
			n2=hold;
		}
		System.out.println(hcf);
		s.close();
	}

}
