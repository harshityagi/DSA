package gfg;

import java.util.Scanner;

public class LargestTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	      int n =s.nextInt();
	      int[] arr=new int[n];
	      int maxIndex = 0;
	        for (int i = 0; i < arr.length; ++i)
	            if (arr[i] > arr[maxIndex])
	                maxIndex = i;     
	        for (int i = 0; i < arr.length; ++i)            
	            if (maxIndex != i && arr[maxIndex] < 2 * arr[i]){
	                  maxIndex= -1;
	                  break;
	            }
	        System.out.println(maxIndex);
//	  Scanner s=new Scanner(System.in);
//      int n =s.nextInt();
//      int[] a=new int[n];
//      int mxi=0;
//      for(int i=0;i<n;i++){
//        a[i]=s.nextInt();
//        if(a[mxi]<a[i]){
//          mxi=i;
//        }
//      }
//      for(int i=0;i<n;i++){
//        if(mxi!=i && a[mxi]<2*a[i]){
//          mxi=-1;
//          break;
//        }
//      }
//      System.out.println(mxi);
      s.close();
	}

}
