package string;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String b="Hello";
		System.out.println(s==b);
		b+="Hi";
		System.out.println(s==b);
		b="Hello I am amazaing";
		System.out.println(b.split(" "));
		
	}
	public void strSubstring() {
	  Scanner sc=new Scanner(System.in);
	  String p=sc.next();
	  String s=sc.next();
	  int pl=p.length();
	  int sl=s.length();
	  int f=0;
	  for(int i=0;i<=sl-pl;i++){
	    int j;
	    for(j=0;j<pl;j++)
	      if(s.charAt(i+j)!=p.charAt(j)) break;
	    if (j==pl) f=1;
	  }
	  if (f==1) System.out.println("YES");
	  else System.out.println("NO");
	  sc.close();
	}

}
