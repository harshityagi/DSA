package math;

import java.util.Scanner;

public class IncreaseRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	      int h1=s.nextInt();
	      int h2=s.nextInt();
	      int v1=s.nextInt();
	      int v2=s.nextInt();
	      int count=0;
	      if (v1>v2) System.out.println(false);
	      else if(v1==v2) System.out.println(false);
	      else{
	        for(int i=1;i>0;i++){
	        	System.out.println("InsideLoop"+i);
	          int h=h1+v1*i;
	          System.out.println("h  "+h);
	          int H=h2+v2*i;
	          System.out.println("H  "+H);
	          if(h==H){
	            count=count+1;
	            //break;
	            //System.out.println("IF "+i);
	          }
	        }
	        if(count>0){
	          System.out.println(true);
	        }else{
	          System.out.println(false);
	        }
	      }
	      s.close();

	}

}
